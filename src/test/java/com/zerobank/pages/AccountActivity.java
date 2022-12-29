package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountActivity extends BasePage{
    @FindBy (css = ".input-xlarge")

    public WebElement sortBtn_loc;

    public void sortBtn_mtd (String sortType){
        Select select = new Select(sortBtn_loc);

        select.selectByVisibleText(sortType);

    }


}

