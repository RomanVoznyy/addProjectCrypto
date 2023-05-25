package Crypto.controller.currency_controllers;

import Crypto.model.CalculatedValues;
import Crypto.model.currency_models.eth.ETH;
import Crypto.service.currency_services.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RequestMapping("/api/v1/eth")
@RequiredArgsConstructor
@RestController
public class ETHController {
	
	private final BaseService<ETH> service;

    @GetMapping(value = "/list", produces = "application/json")
    public List<ETH> getAll() {
        return service.getAllList();
    }

    @GetMapping(value = "/values", produces = "application/json")
    public Optional<CalculatedValues> getValues(String startDate, String endDate) {
        return service.getValues(startDate,endDate);
    }

}
