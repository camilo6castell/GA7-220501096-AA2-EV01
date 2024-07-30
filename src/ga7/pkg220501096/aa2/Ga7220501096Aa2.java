
package ga7.pkg220501096.aa2;

import ga7.pkg220501096.aa2.view.ContactsView;

public class Ga7220501096Aa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ContactsView contactsView = new ContactsView();
        contactsView.setVisible(true);
        contactsView.setLocationRelativeTo(null);
    
//        Statement statement;
//        ResultSet rs;
//        
//        Connection myConnection = MyConnection.connect();
        
//        try {
//
//            System.out.println("Verificando que la tabla está vacía:");
//            System.out.println("");
//            Service.printAllUsers(myConnection);
//            System.out.println("");
//
//            // Crear un usuario y agregarlo a la tabla
//            User newUser = new User();
//            newUser.setUsername("testuser");
//            newUser.setPasswordHash("testhash");
//            newUser.setPublicKey("testkey");
//            Service.createUser(myConnection, newUser);
//
//            // Mostrar que el usuario ha sido creado
//            System.out.println("Usuario creado:");
//            Service.printAllUsers(myConnection);
//            System.out.println("");
//
//            // Actualizar el usuario creado
//            newUser.setPasswordHash("newhash");
//            newUser.setPublicKey("newkey");
//            Service.updateUser(myConnection, newUser);
//
//            // Mostrar que el usuario ha sido actualizado
//            System.out.println("Usuario actualizado:");
//            Service.printAllUsers(myConnection);
//            System.out.println("");
//
//            // Leer un usuario específico
//            User retrievedUser = Service.getUserByUsername(myConnection, "testuser");
//            System.out.println("Usuario recuperado: ");
//            System.out.println( retrievedUser.getUsername() + ", " + retrievedUser.getPasswordHash() + ", " + retrievedUser.getPublicKey());
//            System.out.println("");
//
//            // Eliminar el usuario
//            Service.deleteUser(myConnection, retrievedUser.getUserId());
//
//            // Mostrar que el usuario ha sido eliminado
//            System.out.println("Usuario eliminado:");
//            Service.printAllUsers(myConnection);
//            
//            System.out.println("");
//            System.out.println("");
//
//            // Cerrar la conexión
//            myConnection.close();
//        
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        
    }
    
}
