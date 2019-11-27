package com.example.FlightSearch.controller;

import com.example.FlightSearch.domain.GroupedItineraryResponse;
import com.example.FlightSearch.domain.request.A;
import com.example.FlightSearch.domain.request.revalidate.B;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.util.logging.Logger;

@RestController
public class FlightSearchController {

//    @Autowired
//    Logger logger;

    @PostMapping("/search")
    public ResponseEntity<Object> searchFlight(@Valid @RequestBody A ota_airLowFareSearchRQ) throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
//        logger.log("Steady Buzzz");
       // System.out.println("????????????" + ota_airLowFareSearchRQ.getVersion());

        System.out.println("????????????" + ota_airLowFareSearchRQ.toString());
        System.out.println("????????????" + ota_airLowFareSearchRQ.toString());
  //      System.out.println("????????????" + ota_airLowFareSearchRQ.getOriginDestinationInformation());
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
       // mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        //convert java object to JSON
        String json=mapper.writeValueAsString(ota_airLowFareSearchRQ);
        System.out.println(">>>>>>" +json);
        final String uri = "https://api-crt.cert.havail.sabre.com/v1/offers/shop";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer T1RLAQIbuu0/6heS07BFjIe5+zNKzM99nxBC59Nyuanm8Fb0jKRMOI7+AACwxcJeA6OnGh4ZBGJIrcLpPAHQlLoEjtIBMxpq4S8i+WLV/ol8VyDpV4kURszrjuInRbFp8nwB+1EdNPVjgmPRC0YFpHEqbOBGlfYmf9nPKhFiyzhcfY2Kf/9rbxpoobBbdpbsIduimbIJAZkE07/0QBCU49N2Uc7OounBMmkEWsHtap/dTwvBkz6OZe5477EfHMDGEy0p91Nf6WDfOBqtGuyWP7Ks6TGwXS2ehbb2lj0*");

        HttpEntity<A> entity = new HttpEntity<>(ota_airLowFareSearchRQ,headers);
        String json1=mapper.writeValueAsString(entity);

        System.out.println(entity.toString());
        System.out.println("{{{}{}{}"  +entity.getBody().toString());
        System.out.println(json1);
//       try{
           ResponseEntity<Object> result = restTemplate.exchange(uri, HttpMethod.POST, entity, Object.class);
           System.out.println("'''''''''''''"+result.getBody());

//       } catch (HttpClientErrorException e) {
//           e.printStackTrace();
//           System.out.println(e);
//
//       }



//        GroupedItineraryResponse groupedItineraryResponse = restTemplate.postForObject(uri,entity,GroupedItineraryResponse.class);
//        System.out.println(groupedItineraryResponse);
//        return groupedItineraryResponse;
        return result;
    }

    @PostMapping("/revalidate")
    public ResponseEntity<Object> revalidation(@Valid @RequestBody B ota_airLowFareSearchRQ) throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        // System.out.println("????????????" + ota_airLowFareSearchRQ.getVersion());

        System.out.println("????????????" + ota_airLowFareSearchRQ.toString());
        System.out.println("????????????" + ota_airLowFareSearchRQ.toString());
        //      System.out.println("????????????" + ota_airLowFareSearchRQ.getOriginDestinationInformation());
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
        // mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        //convert java object to JSON
        String json=mapper.writeValueAsString(ota_airLowFareSearchRQ);
        System.out.println(">>>>>>" +json);
//        final String uri = "https://api-crt.cert.havail.sabre.com/v1/offers/shop";
        final String uri = "https://api-crt.cert.havail.sabre.com//v4.3.0/shop/flights/revalidate";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer T1RLAQIbuu0/6heS07BFjIe5+zNKzM99nxBC59Nyuanm8Fb0jKRMOI7+AACwxcJeA6OnGh4ZBGJIrcLpPAHQlLoEjtIBMxpq4S8i+WLV/ol8VyDpV4kURszrjuInRbFp8nwB+1EdNPVjgmPRC0YFpHEqbOBGlfYmf9nPKhFiyzhcfY2Kf/9rbxpoobBbdpbsIduimbIJAZkE07/0QBCU49N2Uc7OounBMmkEWsHtap/dTwvBkz6OZe5477EfHMDGEy0p91Nf6WDfOBqtGuyWP7Ks6TGwXS2ehbb2lj0*");

        HttpEntity<B> entity = new HttpEntity<>(ota_airLowFareSearchRQ,headers);
        String json1=mapper.writeValueAsString(entity);

        System.out.println(entity.toString());
        System.out.println("{{{}{}{}"  +entity.getBody().toString());
        System.out.println(json1);
//       try{
        ResponseEntity<Object> result = restTemplate.exchange(uri, HttpMethod.POST, entity, Object.class);
        System.out.println("'''''''''''''"+result.getBody());

//       } catch (HttpClientErrorException e) {
//           e.printStackTrace();
//           System.out.println(e);
//
//       }



//        GroupedItineraryResponse groupedItineraryResponse = restTemplate.postForObject(uri,entity,GroupedItineraryResponse.class);
//        System.out.println(groupedItineraryResponse);
//        return groupedItineraryResponse;
        return result;
    }

}
