package Backend.database;

import Backend.managementclasses.Admin;
import Backend.managementclasses.DeletedMember;
import Backend.managementclasses.Member;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;


public class DataBase {

    private Admin admin;
    private Member member;

    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet result = null;

    public DataBase() {
        String filePath = "GymData.accdb";
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            connection = DriverManager.getConnection("jdbc:ucanaccess://" + filePath);
        } catch (ClassNotFoundException | SQLException exception) {
            System.out.println(exception.getMessage());
        }

    }

    public void addMember(Member member) {

        String sql = "INSERT INTO membersInfo(name,age,email,password,address,cnic,gender,plannumber,startingdate,endingDate)"
                + " values('" + member.getName() + "','" + member.getAge() + "','" + member.getEmail() + "','" + member.getPassword() + "','" + member.getAddress()
                + "','" + member.getCnic() + "','" + member.getGender() + "','" + member.getPlanNumber() + "','" + member.getStartingDate() + "','" + member.getEndingDate() + "')";

        try {
            statement = connection.createStatement();

            int res = statement.executeUpdate(sql);
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Member Added!");
            } else {
                JOptionPane.showMessageDialog(null, "Error!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void deleteMember(Member member, String reason) {

        addDeletedMember(member, reason);
        String sql = "DELETE FROM membersinfo WHERE email='" + member.getEmail() + "'";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void addDeletedMember(Member member, String reason) {

        String sql = "INSERT INTO deletedmembersInfo(name,age,email,password,address,cnic,gender,plannumber,startingdate,endingDate,reason)"
                + " values('" + member.getName() + "','" + member.getAge() + "','" + member.getEmail() + "','" + member.getPassword() + "','" + member.getAddress()
                + "','" + member.getCnic() + "','" + member.getGender() + "','" + member.getPlanNumber() + "','" + member.getStartingDate() + "','"
                + member.getEndingDate() + "','" + reason + "')";

        try {
            statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public boolean memberLogin(String email, String password) {

        String sql = "SELECT * FROM membersinfo WHERE email='" + email + "' and password='" + password + "'";
        boolean b = false;
        try {
            preparedStatement = connection.prepareStatement(sql);
            result = preparedStatement.executeQuery();
            if (result.next()) {

                member = new Member(result.getString("name"), result.getString("age"), result.getString("email"), result.getString("password"),
                        result.getString("address"), result.getString("cnic"), result.getString("gender"), result.getString("StartingDate"),
                        result.getString("Endingdate"), result.getString("plannumber"));
                member.setId(result.getString("id"));
                b = true;
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Creditinals");
                b = false;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            b = false;
        }
        return b;
    }

    public boolean searchMember(String email) {

        String sql = "SELECT * FROM membersinfo WHERE email='" + email + "'";
        boolean b = false;
        try {
            preparedStatement = connection.prepareStatement(sql);
            result = preparedStatement.executeQuery();
            if (result.next()) {
                member = new Member(result.getString("name"), result.getString("age"), result.getString("email"), result.getString("password"),
                        result.getString("address"), result.getString("cnic"), result.getString("gender"), result.getString("StartingDate"),
                        result.getString("Endingdate"), result.getString("plannumber"));
                member.setId(result.getString("id"));

                b = true;
            } else {
                b = false;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            b = false;
        }
        return b;
    }

    public Member getMember() {
        return this.member;
    }

    public boolean adminLogin(String email, String password) {

        String sql = "SELECT * FROM admininfo WHERE email='" + email + "'and password='" + password + "'";
        boolean b = false;
        try {
            preparedStatement = connection.prepareStatement(sql);
            result = preparedStatement.executeQuery();
            if (result.next()) {

                admin = new Admin(result.getString("name"), result.getString("email"), result.getString("password"));

                b = true;
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Creditinals");
                b = false;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            b = false;
        }
        return b;
    }

    public Admin getAdmin() {
        return admin;
    }

    public ArrayList<Member> getAllMembers() {
        ArrayList<Member> members = new ArrayList<>();

        String sql = "select * from membersinfo";

        try {
            preparedStatement = connection.prepareStatement(sql);
            result = preparedStatement.executeQuery();
            while (result.next()) {
                member = new Member(result.getString("name"), result.getString("age"), result.getString("email"), result.getString("password"),
                        result.getString("address"), result.getString("cnic"), result.getString("gender"), result.getString("StartingDate"),
                        result.getString("Endingdate"), result.getString("plannumber"));
                member.setId(result.getString("id"));
                members.add(member);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        return members;
    }

     public ArrayList<DeletedMember> getAllDeletedMembers() {
        ArrayList<DeletedMember> deletedMember = new ArrayList<>();

        String sql = "select * from deletedmembersinfo";

        try {
            preparedStatement = connection.prepareStatement(sql);
            result = preparedStatement.executeQuery();
            while (result.next()) {
                
                DeletedMember dM = new DeletedMember(result.getString("reason"),result.getString("name"), result.getString("age"), result.getString("email"), result.getString("password"),
                        result.getString("address"), result.getString("cnic"), result.getString("gender"), result.getString("StartingDate"),
                        result.getString("Endingdate"), result.getString("plannumber"));
                dM.setId(result.getString("id"));
                deletedMember.add(dM);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        return deletedMember;
    }
    
    public void updateMember(Member member) {

        String sql = "update membersinfo set name='" + member.getName()
                + "',age='" + member.getAge() + "',email='" + member.getEmail() + "',password='" + member.getPassword()
                + "',address='" + member.getAddress() + "',cnic='" + member.getCnic() + "',gender='" + member.getGender()
                + "',plannumber='" + member.getPlanNumber() + "',startingdate='" + member.getStartingDate() + "',endingdate='" + member.getEndingDate()
                + "'   where id='" + member.getId() + "'";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public boolean isEmailRare(String email) {
        String sql = "select * from membersInfo where email='" + email + "'";
        boolean b;
        try {
            preparedStatement = connection.prepareStatement(sql);
            result = preparedStatement.executeQuery();
            if (result.next()) {
                b = false;
            } else {
                b = true;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            b = true;
        }
        return b;
    }

    // ========================= amounts database
    public long getAmount() {
        String sql = "select * from AmountGenrated where Currency='Dollars'";
        long amount = 0;
        try {
            preparedStatement = connection.prepareStatement(sql);
            result = preparedStatement.executeQuery();
            if (result.next()) {
                String temp = result.getString("Amount");
                amount = Long.parseLong(temp);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
        return amount;
    }

    public void addAmount(int amount) {

        long totalAmount = getAmount() + amount;
        String sql = "update AmountGenrated set amount='" + totalAmount + "' where Currency='Dollars'";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

}
