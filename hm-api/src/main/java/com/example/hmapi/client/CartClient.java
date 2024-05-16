package com.example.hmapi.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Collection;

@FeignClient("cart-service")
public interface CartClient {

   @DeleteMapping("/carts/deleteCartItemByIds")
   void deleteCartItemByIds(@RequestParam("ids") Collection<Long> ids);
}
