package Services;

import Models.EmployeeModel;

import java.util.Scanner;

import static java.lang.System.*;

public class Employee {

    public static Scanner sc = new Scanner(System.in);
    public static void employee (){
        System.out.print("Digite um id: ");
        EmployeeModel.id = Integer.parseInt(sc.nextLine());

        System.out.print("Digite um nome: ");
        EmployeeModel.name = sc.nextLine();

        System.out.print("Digite um CPF: ");
        EmployeeModel.CPF = sc.nextLine();

        System.out.print("Digite um RG: ");
        EmployeeModel.RG = sc.nextLine();

        System.out.print("Digite o sexo: ");
        EmployeeModel.sexo = sc.nextLine();

        System.out.print("Digite o cód da imagem: ");
        EmployeeModel.img = sc.nextLine();

        System.out.print("Digite o Login: ");
        EmployeeModel.usario = sc.nextLine();

        System.out.print("Digite a senha: ");
        EmployeeModel.senha = sc.nextLine();

    }
}
