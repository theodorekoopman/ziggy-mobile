package com.investec.ziggy.common;

import com.investec.ziggy.models.portfoliomodels.Portfolio;

/**
 * Created by Theodore.Koopman on 2016/12/03.
 */

public class PortfolioManager {
    private PortfolioManager() {
    }

    private static PortfolioManager instance;
    private Portfolio portfolio;

    public static PortfolioManager getInstance() {
        if( instance == null ) {
            instance = new PortfolioManager();
        }
        return instance;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}
