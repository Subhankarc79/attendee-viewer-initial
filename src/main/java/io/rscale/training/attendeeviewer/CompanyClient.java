package io.rscale.training.attendeeviewer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.hateoas.PagedResources;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "company")
public interface CompanyClient {

	PagedResources<Company> getCompanies(@RequestParam("page") int page);

    @RequestMapping(method = RequestMethod.GET, value = "/companies/id")
    Company getCompany(@PathVariable("id") String id);
	
	//Company getCompany(String id);
	
}