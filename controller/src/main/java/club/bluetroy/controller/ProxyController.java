package club.bluetroy.controller;

import club.bluetroy.crawler.domain.ProxyConfig;
import club.bluetroy.service.ProxyService;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author heyixin
 * Date: 2018-11-07
 * Time: 5:23 PM
 */
@RestController
@RequestMapping("/proxy")
public class ProxyController {
    private final ProxyService proxyService;

    public ProxyController(ProxyService proxyService) {
        this.proxyService = proxyService;
    }

    @PatchMapping
    public void setProxy(@RequestBody @Valid ProxyConfig proxyConfig) {
        proxyService.setProxy(proxyConfig);
    }
}
