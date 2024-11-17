/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Business;

import model.CustomerManagement.CustomerProfile;
import model.MarketingManagement.MarketingPersonProfile;
import model.OrderManagement.Order;
import model.OrderManagement.OrderItem;
import model.Personnel.*;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.SalesManagement.SalesPersonProfile;
import model.Supplier.Supplier;
import model.UserAccountManagement.UserAccount;

/**
 * @author kal bugrara
 */
public class ConfigureABusiness {

    public static Business initialize() {
        Business business = new Business("Xerox");
        //Keeping suppliers for car category
        //Supplier 1 - Tesla
        Supplier s1 = business.getSupplierDirectory().newSupplier("Tesla");
        ProductCatalog productCatalog1 = s1.getProductCatalog();
        Product pr1 = productCatalog1.newProduct("Tesla Model S Plaid", 100000, 140000, 120000);
        Product pr2 = productCatalog1.newProduct("Tesla Model X", 90000, 130000, 110000);
        Product pr3 = productCatalog1.newProduct("Tesla Model 3 Performance", 50000, 70000, 60000);
        Product pr4 = productCatalog1.newProduct("Tesla Model Y", 55000, 75000, 65000);
        Product pr5 = productCatalog1.newProduct("Tesla Cybertruck (Dual Motor)", 50000, 80000, 70000);
        Product pr6 = productCatalog1.newProduct("Tesla Roadster", 180000, 250000, 200000);
        Product pr7 = productCatalog1.newProduct("Tesla Model 3 Standard", 35000, 45000, 40000);
        Product pr8 = productCatalog1.newProduct("Tesla Semi", 150000, 180000, 165000);
        Product pr9 = productCatalog1.newProduct("Tesla Model X Plaid", 110000, 150000, 130000);
        Product pr10 = productCatalog1.newProduct("Tesla Cybertruck (Tri-Motor)", 70000, 100000, 85000);
        business.getSupplierPerformanceReport(String.valueOf(s1));

        
        //Supplier 2 - Toyota
        Supplier s2 = business.getSupplierDirectory().newSupplier("Toyota");
        ProductCatalog productCatalog2 = s2.getProductCatalog();
        Product pr11 = productCatalog2.newProduct("Toyota Corolla", 20000, 30000, 25000);
        Product pr12 = productCatalog2.newProduct("Toyota Camry", 25000, 35000, 30000);
        Product pr13 = productCatalog2.newProduct("Toyota RAV4", 27000, 40000, 35000);
        Product pr14 = productCatalog2.newProduct("Toyota Highlander", 35000, 50000, 45000);
        Product pr15 = productCatalog2.newProduct("Toyota Tacoma", 26000, 45000, 35000);
        Product pr16 = productCatalog2.newProduct("Toyota Tundra", 40000, 60000, 50000);
        Product pr17 = productCatalog2.newProduct("Toyota Prius", 25000, 35000, 30000);
        Product pr18 = productCatalog2.newProduct("Toyota 4Runner", 38000, 55000, 45000);
        Product pr19 = productCatalog2.newProduct("Toyota Sienna", 35000, 50000, 45000);
        Product pr20 = productCatalog2.newProduct("Toyota Supra", 43000, 60000, 55000);
        business.getSupplierPerformanceReport(String.valueOf(s2));

        
        //Supplier 3 - Ford
        Supplier s3 = business.getSupplierDirectory().newSupplier("Ford");
        ProductCatalog productCatalog3 = s3.getProductCatalog();
        Product pr21 = productCatalog3.newProduct("Ford F-150", 30000, 70000, 50000);
        Product pr22 = productCatalog3.newProduct("Ford Mustang", 27000, 80000, 55000);
        Product pr23 = productCatalog3.newProduct("Ford Explorer", 35000, 55000, 45000);
        Product pr24 = productCatalog3.newProduct("Ford Edge", 33000, 48000, 40000);
        Product pr25 = productCatalog3.newProduct("Ford Ranger", 25000, 45000, 38000);
        Product pr26 = productCatalog3.newProduct("Ford Bronco", 28000, 60000, 45000);
        Product pr27 = productCatalog3.newProduct("Ford Escape", 24000, 40000, 35000);
        Product pr28 = productCatalog3.newProduct("Ford Transit", 35000, 60000, 50000);
        Product pr29 = productCatalog3.newProduct("Ford Expedition", 50000, 80000, 65000);
        Product pr30 = productCatalog3.newProduct("Ford Mach-E", 43000, 65000, 55000);
        business.getSupplierPerformanceReport(String.valueOf(s3));

        
        //Supplier 4 - BMW
        Supplier s4 = business.getSupplierDirectory().newSupplier("BMW");
        ProductCatalog productCatalog4 = s4.getProductCatalog();
        Product pr31 = productCatalog4.newProduct("BMW 3 Series", 40000, 60000, 50000);
        Product pr32 = productCatalog4.newProduct("BMW 5 Series", 50000, 70000, 60000);
        Product pr33 = productCatalog4.newProduct("BMW X3", 43000, 58000, 50000);
        Product pr34 = productCatalog4.newProduct("BMW X5", 60000, 85000, 75000);
        Product pr35 = productCatalog4.newProduct("BMW 7 Series", 90000, 120000, 100000);
        Product pr36 = productCatalog4.newProduct("BMW X1", 37000, 45000, 40000);
        Product pr37 = productCatalog4.newProduct("BMW i3 (Electric)", 45000, 55000, 50000);
        Product pr38 = productCatalog4.newProduct("BMW Z4 Roadster", 50000, 70000, 60000);
        Product pr39 = productCatalog4.newProduct("BMW M5", 100000, 130000, 115000);
        Product pr40 = productCatalog4.newProduct("BMW X6", 65000, 90000, 80000);
        business.getSupplierPerformanceReport(String.valueOf(s4));

        //Supplier 5 - Honda
        Supplier s5 = business.getSupplierDirectory().newSupplier("Honda");
        ProductCatalog productCatalog5 = s5.getProductCatalog();
        Product pr41 = productCatalog5.newProduct("Honda Accord", 25000, 35000, 30000);
        Product pr42 = productCatalog5.newProduct("Honda Civic", 21000, 30000, 27000);
        Product pr43 = productCatalog5.newProduct("Honda CR-V", 28000, 40000, 35000);
        Product pr44 = productCatalog5.newProduct("Honda Pilot", 33000, 50000, 45000);
        Product pr45 = productCatalog5.newProduct("Honda HR-V", 22000, 32000, 28000);
        Product pr46 = productCatalog5.newProduct("Honda Odyssey", 32000, 45000, 40000);
        Product pr47 = productCatalog5.newProduct("Honda Ridgeline", 38000, 50000, 45000);
        Product pr48 = productCatalog5.newProduct("Honda Fit", 16000, 22000, 20000);
        Product pr49 = productCatalog5.newProduct("Honda Insight", 23000, 32000, 28000);
        Product pr50 = productCatalog5.newProduct("Honda Passport", 35000, 45000, 40000);
        business.getSupplierPerformanceReport(String.valueOf(s5));


        //TOdo: Add more suppliers and products later
        //Customer 1 - John
        Person person1 = new Person("Alexander");
        CustomerProfile customer1 = business.getCustomerDirectory().newCustomerProfile(person1);

        //Customer 2 - Jane
        Person person2 = new Person("Olivia");
        CustomerProfile customer2 = business.getCustomerDirectory().newCustomerProfile(person2);

        //Customer 3 - Jack
        Person person3 = new Person("Benjamin");
        CustomerProfile customer3 = business.getCustomerDirectory().newCustomerProfile(person3);

        //Customer 4 - Jill
        Person person4 = new Person("Ava");
        CustomerProfile customer4 = business.getCustomerDirectory().newCustomerProfile(person4);

        //Customer 5 - Joe
        Person person5 = new Person("Ethan");
        CustomerProfile customer5 = business.getCustomerDirectory().newCustomerProfile(person5);

        //Customer 6 - Jim
        Person person6 = new Person("Sophia");
        CustomerProfile customer6 = business.getCustomerDirectory().newCustomerProfile(person6);

        //Customer 7 - peter
        Person person7 = new Person("Matthew");
        CustomerProfile customer7 = business.getCustomerDirectory().newCustomerProfile(person7);

        //Customer 8 - Paul
        Person person8 = new Person("Chloe");
        CustomerProfile customer8 = business.getCustomerDirectory().newCustomerProfile(person8);

        //Customer 9 - Mary
        Person person9 = new Person("James");
        CustomerProfile customer9 = business.getCustomerDirectory().newCustomerProfile(person9);

        //Customer 10 - Mark
        Person person10 = new Person("Lily");
        CustomerProfile customer10 = business.getCustomerDirectory().newCustomerProfile(person10);

        //SalesPerson 1 - Sam
        Person person11 = new Person("William");
        SalesPersonProfile salesPerson1 = business.getSalesPersonDirectory().newSalesPersonProfile(person11);
        UserAccount userAccount1 = business.getUserAccountDirectory().newUserAccount(salesPerson1, "will_adams", "WAdams123");

        //SalesPerson 2 - Sally
        Person person12 = new Person("Mia");
        SalesPersonProfile salesPerson2 = business.getSalesPersonDirectory().newSalesPersonProfile(person12);
        UserAccount userAccount2 = business.getUserAccountDirectory().newUserAccount(salesPerson2, "mia_carter", "MiaC789");

        //SalesPerson 3 - Steve
        Person person13 = new Person("Lucas");
        SalesPersonProfile salesPerson3 = business.getSalesPersonDirectory().newSalesPersonProfile(person13);
        UserAccount userAccount3 = business.getUserAccountDirectory().newUserAccount(salesPerson3, "lucas_baker", "LBaker2024");

        //MarketingPerson 1 - Mike
        Person person14 = new Person("Emma");
        MarketingPersonProfile marketingPerson1 = business.getMarketingPersonDirectory().newMarketingPersonProfile(person14);
        UserAccount userAccount4 = business.getUserAccountDirectory().newUserAccount(marketingPerson1, "emma_turner", "ETurner456");

        //MarketingPerson 2 - Mary
        Person person15 = new Person("Noah");
        MarketingPersonProfile marketingPerson2 = business.getMarketingPersonDirectory().newMarketingPersonProfile(person15);
        UserAccount userAccount5 = business.getUserAccountDirectory().newUserAccount(marketingPerson2, "noah_foster", "NoahF123");

        //Order 1
        Order order1 = business.getMasterOrderList().newOrder(customer1, salesPerson1);
        OrderItem orderItem1 = order1.newOrderItem(pr1, 13300, 1); // Above target
        OrderItem orderItem2 = order1.newOrderItem(pr11, 23000, 1); // Below target
        OrderItem orderItem3 = order1.newOrderItem(pr21, 60000, 1); // Above target

//Order 2
        Order order2 = business.getMasterOrderList().newOrder(customer2, salesPerson2);
        OrderItem orderItem4 = order2.newOrderItem(pr2, 120000, 1); // Above target
        OrderItem orderItem5 = order2.newOrderItem(pr12, 35000, 1); // Above target
        OrderItem orderItem6 = order2.newOrderItem(pr22, 65000, 1); // Below target

//Order 3
        Order order3 = business.getMasterOrderList().newOrder(customer3, salesPerson3);
        OrderItem orderItem7 = order3.newOrderItem(pr3, 51000, 1); // Below target
        OrderItem orderItem8 = order3.newOrderItem(pr33, 56000, 1); // Above target
        OrderItem orderItem9 = order3.newOrderItem(pr43, 40000, 1); // Above target

//Order 4
        Order order4 = business.getMasterOrderList().newOrder(customer4, salesPerson1);
        OrderItem orderItem10 = order4.newOrderItem(pr4, 75000, 1); // Above target
        OrderItem orderItem11 = order4.newOrderItem(pr34, 60000, 1); // Below target
        OrderItem orderItem12 = order4.newOrderItem(pr44,35000 , 1); // Below target

//Order 5
        Order order5 = business.getMasterOrderList().newOrder(customer5, salesPerson2);
        OrderItem orderItem13 = order5.newOrderItem(pr5, 79000, 1); // Above target
        OrderItem orderItem14 = order5.newOrderItem(pr15, 40000, 1); // Above target
        OrderItem orderItem15 = order5.newOrderItem(pr25, 27000, 1); // Below target

//Order 6
        Order order6 = business.getMasterOrderList().newOrder(customer6, salesPerson3);
        OrderItem orderItem16 = order6.newOrderItem(pr6, 210000, 1); // Above target
        OrderItem orderItem17 = order6.newOrderItem(pr16, 55000, 1); // Above target
        OrderItem orderItem18 = order6.newOrderItem(pr26,45000 , 1); // Below target

//Order 7
        Order order7 = business.getMasterOrderList().newOrder(customer7, salesPerson1);
        OrderItem orderItem19 = order7.newOrderItem(pr7,42000 , 1); // Above target
        OrderItem orderItem20 = order7.newOrderItem(pr17,33000, 1); // Above target
        OrderItem orderItem21 = order7.newOrderItem(pr27,30000, 1); // Below target

//Order 8
        Order order8 = business.getMasterOrderList().newOrder(customer8, salesPerson2);
        OrderItem orderItem22 = order8.newOrderItem(pr8,170000,1); // Above target
        OrderItem orderItem23 = order8.newOrderItem(pr18, 50000, 1); // Above target
        OrderItem orderItem24 = order8.newOrderItem(pr28, 45000, 1); // Below target

//Order 9
        Order order9 = business.getMasterOrderList().newOrder(customer9, salesPerson3);
        OrderItem orderItem25 = order9.newOrderItem(pr9,120000 , 1); // Below target
        OrderItem orderItem26 = order9.newOrderItem(pr19, 49000, 1); // Above target
        OrderItem orderItem27 = order9.newOrderItem(pr29, 55000, 1); // Below target

//Order 10
        Order order10 = business.getMasterOrderList().newOrder(customer10, salesPerson1);
        OrderItem orderItem28 = order10.newOrderItem(pr10,90000, 1); // Above target
        OrderItem orderItem29 = order10.newOrderItem(pr20, 57000, 1); // Above target
        OrderItem orderItem30 = order10.newOrderItem(pr30, 45000, 1); // Below target

//        10 more orders
        Order order11 = business.getMasterOrderList().newOrder(customer1, salesPerson2);
        OrderItem orderItem31 = order11.newOrderItem(pr31, 55000, 1); // Above target
        OrderItem orderItem32 = order11.newOrderItem(pr41, 34000, 1); // Above target
        OrderItem orderItem33 = order11.newOrderItem(pr1, 110000, 1); // Below target

        Order order12 = business.getMasterOrderList().newOrder(customer2, salesPerson3);
        OrderItem orderItem34 = order12.newOrderItem(pr32,55000 , 1); // Below target
        OrderItem orderItem35 = order12.newOrderItem(pr42, 29000, 1); // Above target
        OrderItem orderItem36 = order12.newOrderItem(pr2, 100000, 1); // Below target

        Order order13 = business.getMasterOrderList().newOrder(customer3, salesPerson1);
        OrderItem orderItem37 = order13.newOrderItem(pr33, 55000, 1); // Above target
        OrderItem orderItem38 = order13.newOrderItem(pr43, 37000, 1); // Above target
        OrderItem orderItem39 = order13.newOrderItem(pr3, 54000, 1); // Below target

        Order order14 = business.getMasterOrderList().newOrder(customer4, salesPerson2);
        OrderItem orderItem40 = order14.newOrderItem(pr34,70000 , 1); // Below target
        OrderItem orderItem41 = order14.newOrderItem(pr44, 47000, 1); // Above target
        OrderItem orderItem42 = order14.newOrderItem(pr4, 60000, 1); // Below target

        Order order15 = business.getMasterOrderList().newOrder(customer5, salesPerson3);
        OrderItem orderItem43 = order15.newOrderItem(pr35,110000 , 1); // Above target
        OrderItem orderItem44 = order15.newOrderItem(pr45,31000, 1); // Above target
        OrderItem orderItem45 = order15.newOrderItem(pr5, 60000, 1); // Below target

        Order order16 = business.getMasterOrderList().newOrder(customer6, salesPerson1);
        OrderItem orderItem46 = order16.newOrderItem(pr36,54000, 1); // Above target
        OrderItem orderItem47 = order16.newOrderItem(pr46,44000, 1); // Above target
        OrderItem orderItem48 = order16.newOrderItem(pr6, 190000, 1); // Below target

        Order order17 = business.getMasterOrderList().newOrder(customer7, salesPerson2);
        OrderItem orderItem49 = order17.newOrderItem(pr37, 53000, 1); // Above target
        OrderItem orderItem50 = order17.newOrderItem(pr47,48000, 1); // Above target
        OrderItem orderItem51 = order17.newOrderItem(pr7, 36000, 1); // Below target

        Order order18 = business.getMasterOrderList().newOrder(customer8, salesPerson3);
        OrderItem orderItem52 = order18.newOrderItem(pr38, 66000, 1); // Above target
        OrderItem orderItem53 = order18.newOrderItem(pr48, 22000, 1); // Above target
        OrderItem orderItem54 = order18.newOrderItem(pr8, 155000, 1); // Below target

        Order order19 = business.getMasterOrderList().newOrder(customer9, salesPerson1);
        OrderItem orderItem55 = order19.newOrderItem(pr39,120000, 1); // Above target
        OrderItem orderItem56 = order19.newOrderItem(pr49,30000, 1); // Above target
        OrderItem orderItem57 = order19.newOrderItem(pr9,120000, 1); // Below target

        Order order20 = business.getMasterOrderList().newOrder(customer10, salesPerson2);
        OrderItem orderItem58 = order20.newOrderItem(pr40,89000, 1); // Above target
        OrderItem orderItem59 = order20.newOrderItem(pr50,43000, 1); // Above target
        OrderItem orderItem60 = order20.newOrderItem(pr10,72000, 1); // Below target
        

        return business;
    }
}
