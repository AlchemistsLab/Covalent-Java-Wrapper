package com.covalenthq.java;

import java.io.IOException;

/**
 * @author MMoussa
 *
 */
public class CovalentClassB {
	private CovalentSession covSession;
	public CovalentClassB(CovalentSession covSession) {
		this.covSession=covSession;
	}	
	// GET {chain_id}/address/{address}/stacks/aave_v2/balances/
	public String getAaveV2AddressBalances (CovalentNetworks cn,String address) throws IOException {
		String req = cn.getValue()+"/address/"+address+"/stacks/aave_v2/balances/";
		return covSession.query(req);
	}
	// GET {chain_id}/address/{address}/stacks/sushiswap/acts/
	public String getSushiswapAddressExchangeLiquidityTransactions (CovalentNetworks cn,String address,CovalentQuoteCurrency cqc,String swaps) throws IOException {
		String req = cn.getValue()+"/address/"+address+"/stacks/sushiswap/acts/";
		req+="?quote-currency="+cqc.getValue();
		req+="&swaps="+swaps;
		return covSession.query(req);
	}
	// GET {chain_id}/address/{address}/stacks/sushiswap/balances/
	public String getSushiswapAddressExchange (CovalentNetworks cn,String address,CovalentQuoteCurrency cqc) throws IOException {
		String req = cn.getValue()+"/address/"+address+"/stacks/sushiswap/balances/";
		req+="?quote-currency="+cqc.getValue();
		return covSession.query(req);
	}
	// GET {chain_id}/networks/aave_v2/assets/
	public String getAaveV2NetworkAssets (CovalentNetworks cn) throws IOException {
		String req = cn.getValue()+"/networks/aave_v2/assets/";
		return covSession.query(req);
	}
	// GET {chain_id}/networks/sushiswap/assets/
	public String getSushiswapNetworkAssets (CovalentNetworks cn,String tickers) throws IOException {
		String req = cn.getValue()+"/networks/aave_v2/assets/";
		req+="?tickers="+tickers;
		return covSession.query(req);
	}
	// GET 1/address/{address}/stacks/aave_v2/balances/
	public String getAaveV2AddressBalance (CovalentNetworks cn,String address) throws IOException {
		String req = "1/address/"+address+"/stacks/aave_v2/balances/";
		return covSession.query(req);
	}
	// GET 1/address/{address}/stacks/aave/balances/
	public String getAaveAddressBalance (String address) throws IOException {
		String req = "1/address/"+address+"/stacks/aave/balances/";
		return covSession.query(req);
	}
	// GET 1/address/{address}/stacks/balancer/balances/
	public String getBalancerExchangeAddressBalance (String address) throws IOException {
		String req = "1/address/"+address+"/stacks/balancer/balances/";
		return covSession.query(req);
	}
	// GET 1/address/{address}/stacks/compound/acts/
	public String getCompoundAddressActivity (String address) throws IOException {
		String req = "1/address/"+address+"/stacks/compound/acts/";
		return covSession.query(req);
	}
	// GET 1/address/{address}/stacks/compound/balances/
	public String getCompoundAddressBalances (String address) throws IOException {
		String req = "1/address/"+address+"/stacks/compound/balances/";
		return covSession.query(req);
	}
	// GET 1/address/{address}/stacks/curve/balances/
	public String getCurveAddressBalances (String address) throws IOException {
		String req = "1/address/"+address+"/stacks/curve/balances/";
		return covSession.query(req);
	}
	// GET 1/address/{address}/stacks/farming/positions/
	public String getFarminAddressStats (String address) throws IOException {
		String req = "1/address/"+address+"/stacks/farming/positions/";
		return covSession.query(req);
	}
	// GET 1/address/{address}/stacks/uniswap_v1/balances/
	public String getUniswapV1AddressExchangeBalances (String address) throws IOException {
		String req = "1/address/"+address+"/stacks/uniswap_v1/balances/";
		return covSession.query(req);
	}
	// GET 1/address/{address}/stacks/uniswap_v2/acts/
	public String getUniswapV2AddressLquidityTransactions (String address,String swaps) throws IOException {
		String req = "1/address/"+address+"/stacks/uniswap_v2/acts/";
		req+="?swaps="+swaps;
		return covSession.query(req);
	}
	// GET 1/address/{address}/stacks/uniswap_v2/balances/
	public String getUniswapV2AddressExchangeBalances (String address) throws IOException {
		String req = "1/address/"+address+"/stacks/uniswap_v2/balances/";
		return covSession.query(req);
	}
	// GET networks/aave/assets/
	public String getAaveNetworkAssets () throws IOException {
		String req = "1/networks/aave/assets/";
		return covSession.query(req);
	}
	// GET 1/networks/augur/affiliate_fee/
	public String getAugurMarketAffiliateFeeDivisors () throws IOException {
		String req = "1/networks/augur/affiliate_fee/";
		return covSession.query(req);
	}
	// GET 1/networks/compound/assets/
	public String getCompoundNetworkAssets () throws IOException {
		String req = "1/networks/compound/assets/";
		return covSession.query(req);
	}
	// GET 1/networks/uniswap_v2/assets/
	public String getUniswapV2NetworkAssets () throws IOException {
		String req = "1/networks/uniswap_v2/assets/";
		return covSession.query(req);
	}
	// GET 56/address/{address}/stacks/pancakeswap_v2/balances/
	public String getPancakeswapV2AddressExchangeBalances (String address,CovalentQuoteCurrency cqc) throws IOException {
		String req = "56/address/"+address+"/stacks/pancakeswap_v2/balances/";
		req+="?quote-currency="+cqc.getValue();
		return covSession.query(req);
	}
	// GET 56/address/{address}/stacks/pancakeswap/acts/
	public String getPancakeswapV2AddressExchangeLiquidityTransactions (String address,CovalentQuoteCurrency cqc,String swaps) throws IOException {
		String req = "56/address/"+address+"/stacks/pancakeswap/acts/";
		req+="?quote-currency="+cqc.getValue();
		req+="&swaps="+swaps;
		return covSession.query(req);
	}
	// GET 56/address/{address}/stacks/pancakeswap/balances/
	public String getPancakeswapAddressExchangeBalances (String address,CovalentQuoteCurrency cqc) throws IOException {
		String req = "56/address/"+address+"/stacks/pancakeswap/balances/";
		req+="?quote-currency="+cqc.getValue();
		return covSession.query(req);
	}
	// GET 56/networks/pancakeswap_v2/assets/
	public String getPancakeswapV2NetworkAssets (String tickers,String contract_addresses) throws IOException {
		String req = "56/networks/pancakeswap_v2/assets/";
		req+="?tickers="+tickers;
		req+="&contract-addresses="+contract_addresses;
		return covSession.query(req);
	}
	// GET 56/networks/pancakeswap_v2/assets/{address}/
	public String getPancakeswapV2NetworkAssetsByAddress (String addresses) throws IOException {
		String req = "56/networks/pancakeswap_v2/assets/"+addresses+"/";
		return covSession.query(req);
	}
	// GET 56/networks/pancakeswap/assets/
	public String getPancakeswapNetworkAssets (String tickers) throws IOException {
		String req = "56/networks/pancakeswap/assets/";
		req+="?tickers="+tickers;
		return covSession.query(req);
	}
}
