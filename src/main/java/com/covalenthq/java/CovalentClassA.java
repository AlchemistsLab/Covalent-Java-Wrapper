package com.covalenthq.java;

import java.io.IOException;

/**
 * @author MMoussa
 *
 */
public class CovalentClassA {
	private CovalentSession covSession;
	public CovalentClassA(CovalentSession covSession) {
		this.covSession=covSession;
	}
	// GET {chain_id}/address/{address}/balances_v2/
	public String getTokenBalancesForAddress(CovalentNetworks cn,String address,boolean nft,boolean noNftFetch,CovalentQuoteCurrency cqc,String primer,String match,String group,String sort,int skip,int limit) throws IOException {
		var req  = cn.getValue()+"/address/"+address+"/balances_v2/";
		var params = new String[] {"nft", "no-nft-fetch", "match", "group", "sort", "skip", "primer", "quote-currency", "limit"};
		var paramValues = new Object[] {nft? "true":"false", noNftFetch?"true": "false", match, group, sort, skip, primer, cqc.getValue(), limit };
		return covSession.query(StringUtil.ConcatUrlParams(req, params, paramValues));
	}
	// GET {chain_id}/address/{address}/portfolio_v2/
	public String getHistoricalPortfolioValueOverTime(CovalentNetworks cn,String address,CovalentQuoteCurrency cqc,String primer,String match,String group,String sort,int skip,int limit) throws IOException {
		var req  = cn.getValue()+"/address/"+address+"/portfolio_v2/";
		var params = new String[] { "match", "group", "sort", "skip", "primer", "quote-currency", "limit"};
		var paramValues = new Object[] {match, group, sort, skip, primer, cqc.getValue(), limit };
		return covSession.query(StringUtil.ConcatUrlParams(req, params, paramValues));
	}
	// GET {chain_id}/address/{address}/transactions_v2/
	public String getTransactions(CovalentNetworks cn,String address,CovalentQuoteCurrency cqc,boolean block_signed_at_asc,boolean no_logs,String primer,String match,String group,String sort,int skip,int limit) throws IOException {
		var req  = cn.getValue()+"/address/"+address+"/transactions_v2/";
		var params = new String[] { "block-signed-at-asc", "no-logs" ,"match", "group", "sort", "skip", "primer", "quote-currency", "limit"};
		var paramValues = new Object[] {block_signed_at_asc? "true": "false", no_logs? "true": false, match, group, sort, skip, primer, cqc.getValue(), limit };
		return covSession.query(StringUtil.ConcatUrlParams(req, params, paramValues));
	}
	// GET {chain_id}/address/{address}/transfers_v2/
	public String getERC20Transfers(CovalentNetworks cn,String address,String contract_address,CovalentQuoteCurrency cqc,boolean block_signed_at_asc,boolean no_logs,String primer,String match,String group,String sort,int skip,int limit) throws IOException {
		var req  = cn.getValue()+"/address/"+address+"/transfers_v2/";
		var params = new String[] { "contract-address", "match", "group", "sort", "skip", "primer", "quote-currency", "limit"};
		var paramValues = new Object[] {contract_address, match, group, sort, skip, primer, cqc.getValue(), limit };
		return covSession.query(StringUtil.ConcatUrlParams(req, params, paramValues));
	}
	// GET {chain_id}/block_v2/{block_height}/
	public String getBlock(CovalentNetworks cn,String blockHeight,CovalentQuoteCurrency cqc,String primer,String match,String group,String sort,int skip,int limit) throws IOException {
		var req  = cn.getValue()+"/block_v2/"+blockHeight+"/";
		var params = new String[] { "match", "group", "sort", "skip", "primer", "quote-currency", "limit"};
		var paramValues = new Object[] {match, group, sort, skip, primer, cqc.getValue(), limit };
		return covSession.query(StringUtil.ConcatUrlParams(req, params, paramValues));
	}
	// GET {chain_id}/block_v2/{start_date}/{end_date}/
	public String getBlockHeights(CovalentNetworks cn,String start_date ,String end_date,CovalentQuoteCurrency cqc,String primer,String match,String group,String sort,int skip,int limit) throws IOException {
		var req  = cn.getValue()+"/block_v2/"+start_date+"/"+end_date+"/";
		var params = new String[] { "match", "group", "sort", "skip", "primer", "quote-currency", "limit"};
		var paramValues = new Object[] {match, group, sort, skip, primer, cqc.getValue(), limit };
		return covSession.query(StringUtil.ConcatUrlParams(req, params, paramValues));
	}
	// GET {chain_id}/events/address/{address}/
	public String getLogEventsByContractAddress(CovalentNetworks cn,String address,String starting_block,String ending_block,CovalentQuoteCurrency cqc,String primer,String match,String group,String sort,int skip,int limit) throws IOException {
		var req  = cn.getValue()+"/events/address/"+address+"/";
		var params = new String[] {"starting-block", "ending-block", "match", "group", "sort", "skip", "primer", "quote-currency", "limit"};
		var paramValues = new Object[] {starting_block, ending_block, match, group, sort, skip, primer, cqc.getValue(), limit };
		return covSession.query(StringUtil.ConcatUrlParams(req, params, paramValues));
	}
	// GET {chain_id}/events/topics/{topic}/
	public String getLogEventsByTopicHashes(CovalentNetworks cn,String topic,String secondary_topic,String starting_block,String ending_block,String sender_address,CovalentQuoteCurrency cqc,String primer,String match,String group,String sort,int skip,int limit) throws IOException {
		var req  = cn.getValue()+"/events/topics/"+topic+"/";
		var params = new String[] {"secondary-topic", "starting-block", "ending-block", "sender-address", "match", "group", "sort", "skip", "primer", "quote-currency", "limit"};
		var paramValues = new Object[] {secondary_topic, starting_block, ending_block, sender_address, match, group, sort, skip, primer, cqc.getValue(), limit };
		return covSession.query(StringUtil.ConcatUrlParams(req, params, paramValues));
	}
	// GET {chain_id}/tokens/{address}/nft_metadata/{token_id}/
	public String getExternalNFTMetadata(CovalentNetworks cn,String address,String token_id,CovalentQuoteCurrency cqc,String primer,String match,String group,String sort,int skip,int limit) throws IOException {
		var req  = cn.getValue()+"/tokens/"+address+"/nft_metadata/"+token_id+"/";
		var params = new String[] { "match", "group", "sort", "skip", "primer", "quote-currency", "limit"};
		var paramValues = new Object[] {match, group, sort, skip, primer, cqc.getValue(), limit };
		return covSession.query(StringUtil.ConcatUrlParams(req, params, paramValues));
	}
	// GET {chain_id}/tokens/{address}/nft_token_ids/
	public String getNFTTokensIDs(CovalentNetworks cn,String address,CovalentQuoteCurrency cqc,String primer,String match,String group,String sort,int skip,int limit) throws IOException {
		var req  = cn.getValue()+"/tokens/"+address+"/nft_token_ids/";
		var params = new String[] { "match", "group", "sort", "skip", "primer", "quote-currency", "limit"};
		var paramValues = new Object[] {match, group, sort, skip, primer, cqc.getValue(), limit };
		return covSession.query(StringUtil.ConcatUrlParams(req, params, paramValues));
	}
	// GET {chain_id}/tokens/{address}/nft_transactions/{token_id}/
	public String getNFTTransactions(CovalentNetworks cn,String address,String token_id,CovalentQuoteCurrency cqc,String primer,String match,String group,String sort,int skip,int limit) throws IOException {
		var req  = cn.getValue()+"/tokens/"+address+"/nft_transactions/"+token_id+"/";
		var params = new String[] { "match", "group", "sort", "skip", "primer", "quote-currency", "limit"};
		var paramValues = new Object[] {match, group, sort, skip, primer, cqc.getValue(), limit };
		return covSession.query(StringUtil.ConcatUrlParams(req, params, paramValues));
	}
	// GET {chain_id}/tokens/{address}/token_holders_changes/
	public String getChangesInTokenHolders(CovalentNetworks cn,String address,CovalentQuoteCurrency cqc,String starting_block,String ending_block,String primer,String match,String group,String sort,int skip,int limit) throws IOException {
		var req  = cn.getValue()+"/tokens/"+address+"/token_holders_changes/";
		var params = new String[] {"starting-block", "ending-block", "match", "group", "sort", "skip", "primer", "quote-currency", "limit"};
		var paramValues = new Object[] {starting_block, ending_block, match, group, sort, skip, primer, cqc.getValue(), limit };
		return covSession.query(StringUtil.ConcatUrlParams(req, params, paramValues));
		
	}
	// GET {chain_id}/tokens/{address}/token_holders/
	public String getTokenHoldersASOfBlockHeight(CovalentNetworks cn,String address,String block_height,CovalentQuoteCurrency cqc,String starting_block,String ending_block,String primer,String match,String group,String sort,int skip,int limit) throws IOException {
		var req  = cn.getValue()+"/tokens/"+address+"/token_holders/";
		var params = new String[] {"starting-block", "match", "group", "sort", "skip", "primer", "quote-currency", "limit"};
		var paramValues = new Object[] {starting_block, match, group, sort, skip, primer, cqc.getValue(), limit };
		return covSession.query(StringUtil.ConcatUrlParams(req, params, paramValues));
	}
	// GET {chain_id}/tokens/tokenlists/{id}/
	public String getAllContractMetaData(CovalentNetworks cn,String id,String block_height,CovalentQuoteCurrency cqc,String starting_block,String ending_block,String primer,String match,String group,String sort,int skip,int limit) throws IOException {
		var req  = cn.getValue()+"/tokens/tokenlists/"+id+"/";
		var params = new String[] {"starting-block", "match", "group", "sort", "skip", "primer", "quote-currency", "limit"};
		var paramValues = new Object[] {starting_block, match, group, sort, skip, primer, cqc.getValue(), limit };
		return covSession.query(StringUtil.ConcatUrlParams(req, params, paramValues));
	}
	// GET {chain_id}/transaction_v2/{tx_hash}/
	public String getTransaction(CovalentNetworks cn,String tx_hash,boolean no_logs,CovalentQuoteCurrency cqc,String primer,String match,String group,String sort,int skip,int limit) throws IOException {
		var req  = cn.getValue()+"/transaction_v2/"+tx_hash+"/";
		var params = new String[] {"no-logs", "match", "group", "sort", "skip", "primer", "quote-currency", "limit"};
		var paramValues = new Object[] {no_logs? "true": "false", match, group, sort, skip, primer, cqc.getValue(), limit };
		return covSession.query(StringUtil.ConcatUrlParams(req, params, paramValues));
	}
	// GET chains/
	public String getAllChain () throws IOException {
		var req  = "chains/";
		return covSession.query(req);
	}
	// GET chains/status/
	public String getAllChainStatuses () throws IOException {
		var req  = "chains/status/";
		return covSession.query(req);
	}
}
