package com.cenxui.tea.app.service.catagory;

import com.cenxui.tea.app.service.catagory.repository.ProductRepositoryManager;
import com.cenxui.tea.app.service.core.CoreController;
import spark.Request;
import spark.Response;
import spark.Route;

public class ProductCoreController extends CoreController {

    public static Route fetchAllProducts = (Request request,  Response response) -> {
       Iterable<Product> products = ProductRepositoryManager.getManager().getAllProducts();
       return products;
    };

    //TODO

}