package org.example;

import Services.Employee;
import View.Presentation;
import View.cadastroSales;


public class Main {

    public static void main(String[] args) {

        Employee.employee();

        Presentation.presentation();

        cadastroSales cadastro = new cadastroSales();

        cadastroSales.cadastrarVendas();


    }
}