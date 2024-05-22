package online.cnecom.cnecomapi.taobao;

import online.cnecom.cnecomapi.taobao.model.ItemSearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TaobaoController {
    private final RestTemplate restTemplate;

    @Autowired
    public TaobaoController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/taobao/item/search")
    public ItemSearchResponse taobaoItemSearch(String query) {
        String url = "https://api.kongcrdv.com/taobao/api_call.php?api_name=item_search&q=" + query + "&page=1&key=HaulBuy";
        return restTemplate.getForObject(url, ItemSearchResponse.class);
    }
}