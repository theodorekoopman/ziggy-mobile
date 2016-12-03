package com.investec.ziggy.common;

import com.investec.ziggy.models.portfoliomodels.ChildAccount;
import com.investec.ziggy.models.portfoliomodels.Portfolio;

/**
 * Created by Theodore.Koopman on 2016/12/03.
 */

public class PortfolioManager {
    private PortfolioManager() {
    }

    private static PortfolioManager instance;
    private Portfolio portfolio;
    private ChildAccount selectedChild;

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

    public ChildAccount getSelectedChild() {
        return selectedChild;
    }

    public void setSelectedChild(ChildAccount selectedChild) {
        this.selectedChild = selectedChild;
    }
}
