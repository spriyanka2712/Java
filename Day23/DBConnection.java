package Day23;
import java.sql.*;
import java.util.Scanner;

public class DBConnection {

    static final String URL = "jdbc:mysql://127.0.0.1:3306/students1";
    static final String USER = "root";
    static final String PASSWORD = "admin";

    // ─── Get Connection ───────────────────────────────────────────
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // ─── CREATE ───────────────────────────────────────────────────
    public static void insertStudent(int id, String name, int age, String email) {
        String sql = "INSERT INTO students (id, name, age, email) VALUES (?, ?, ?, ?)";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.setString(4, email);

            int rows = ps.executeUpdate();
            System.out.println("INSERT successful. Rows affected: " + rows);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ─── READ (All) ────────────────────────────────────────────────
    public static void getAllStudents() {
        String sql = "SELECT * FROM students";

        try (Connection con = getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("\n─────────────────────────────────────────");
            System.out.printf("%-5s %-15s %-5s %-25s%n", "ID", "Name", "Age", "Email");
            System.out.println("─────────────────────────────────────────");

            while (rs.next()) {
                System.out.printf("%-5d %-15s %-5d %-25s%n",
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("age"),
                    rs.getString("email")
                );
            }
            System.out.println("─────────────────────────────────────────\n");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ─── READ (Single by ID) ───────────────────────────────────────
    public static void getStudentById(int id) {
        String sql = "SELECT * FROM students WHERE id = ?";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("\nStudent Found:");
                System.out.println("  ID    : " + rs.getInt("id"));
                System.out.println("  Name  : " + rs.getString("name"));
                System.out.println("  Age   : " + rs.getInt("age"));
                System.out.println("  Email : " + rs.getString("email"));
            } else {
                System.out.println("No student found with ID: " + id);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ─── UPDATE ───────────────────────────────────────────────────
    public static void updateStudent(int id, String newName, int newAge, String newEmail) {
        String sql = "UPDATE students SET name = ?, age = ?, email = ? WHERE id = ?";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, newName);
            ps.setInt(2, newAge);
            ps.setString(3, newEmail);
            ps.setInt(4, id);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("UPDATE successful for ID: " + id);
            } else {
                System.out.println("No student found with ID: " + id);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ─── DELETE ───────────────────────────────────────────────────
    public static void deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE id = ?";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("DELETE successful for ID: " + id);
            } else {
                System.out.println("No student found with ID: " + id);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ─── MAIN / MENU ──────────────────────────────────────────────
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Quick test — comment out after verifying
        System.out.println("Testing DB connection...");
        try (Connection con = getConnection()) {
            System.out.println("Connected successfully!\n");
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
            return;
        }

        while (true) {
            System.out.println("====== Student CRUD Menu ======");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. View Student by ID");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");    int id = sc.nextInt();
                    System.out.print("Enter Name: ");  String name = sc.next();
                    System.out.print("Enter Age: ");   int age = sc.nextInt();
                    System.out.print("Enter Email: "); String email = sc.next();
                    insertStudent(id, name, age, email);
                    break;

                case 2:
                    getAllStudents();
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    getStudentById(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter ID to update: ");   int uid = sc.nextInt();
                    System.out.print("Enter new Name: ");        String uname = sc.next();
                    System.out.print("Enter new Age: ");         int uage = sc.nextInt();
                    System.out.print("Enter new Email: ");       String uemail = sc.next();
                    updateStudent(uid, uname, uage, uemail);
                    break;

                case 5:
                    System.out.print("Enter ID to delete: ");
                    deleteStudent(sc.nextInt());
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.\n");
            }
        }
    }
}