package com.example.hmapi.client;
import com.example.hmapi.domain.dto.ItemDTO;
import com.example.hmapi.domain.dto.OrderDetailDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;

@FeignClient("item-service")
public interface ItemClient {

    @GetMapping("/items")
    List<ItemDTO> queryItemByIds(@RequestParam(value = "ids") Collection<Long> ids);

    @PutMapping("/stock/deduct")
    void  deductStock(@RequestBody List<OrderDetailDTO> items);
}
