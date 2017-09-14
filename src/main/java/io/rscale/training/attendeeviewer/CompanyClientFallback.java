package io.rscale.training.attendeeviewer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.PagedResources;
import org.springframework.hateoas.PagedResources.PageMetadata;
import org.springframework.stereotype.Component;

@Component
public class CompanyClientFallback implements CompanyClient {

	@Override
	public PagedResources<Company> getCompanies(int page) {
		List<Company> companies = new ArrayList<Company>();
		companies.add(new Company());

		return new PagedResources<Company>(companies, new PageMetadata(1, 1, 1, 1), new Link("/"));
	}

	@Override
	public Company getCompany(String id) {
		return new Company();
	}

}
