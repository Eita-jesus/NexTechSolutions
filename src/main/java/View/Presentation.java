package View;

import Models.EmployeeModel;
import Models.EmployeeModelMock;


public class Presentation {
    public static EmployeeModel fun = new EmployeeModel();
    public static EmployeeModelMock funmock = new EmployeeModelMock();
    public static void presentation(){

        System.out.print(
                "id: " + EmployeeModelMock.id + "\n"+
                        "name: " + EmployeeModelMock.name + "\n"+
                        "Data de Nascimento: " + EmployeeModelMock.DataNasc + "\n"+
                        "CPF: " + EmployeeModelMock.CPF + "\n"+
                        "RG: " + EmployeeModelMock.RG + "\n"+
                        "Sexo: " + EmployeeModelMock.sexo + "\n"+
                        "Foto: " + EmployeeModelMock.img + "\n"+
                        "Usuário: " + EmployeeModelMock.usuario + "\n"+
                        "Senha: " + EmployeeModelMock.senha
        );


    }

}
