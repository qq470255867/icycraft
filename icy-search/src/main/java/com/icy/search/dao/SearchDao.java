package com.icy.search.dao;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;

import com.icy.search.pojo.SearchResult;

public interface SearchDao {
	
	SearchResult searchDao (SolrQuery solrQuery) throws SolrServerException;

}
