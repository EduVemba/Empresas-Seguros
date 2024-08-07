import DB.EmpresaDAO;
import DB.UserDAO;
import empresa.Empresa;
import user.User;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        UserDAO userDAO = new UserDAO();
        EmpresaDAO empresaDAO = new EmpresaDAO();

        Empresa TechSolutions = new Empresa();
        TechSolutions.setNome("Tech Solutions");
        empresaDAO.addEmpresa(TechSolutions);

        User Eduardo = new User();
        Eduardo.setName("Eduardo");
        Eduardo.setEmail("eduardo@gmail.com");
        Eduardo.setPassword("eduv2403");
        Eduardo.setDob(LocalDate.of(2004, Month.JANUARY,24));
        Eduardo.setEmpresaId(TechSolutions.getId());
        userDAO.addUser(Eduardo);
    }
}