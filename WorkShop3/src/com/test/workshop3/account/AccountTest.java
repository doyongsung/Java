package com.test.workshop3.account;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.test.workshop3.exception.AccountNotFoundException;
import com.test.workshop3.exception.InvalidValueException;

public class AccountTest {    
    public static void main( String[] args ) {        
        int menu  = 0;
        Account acc = null;
        
        while ( menu != 9 ) {            
            printMenu();            
            try {           
            	//String account;    String account = getUserInput();
            	//String name;       String name = getUserInput();
            	//int balance;       int balance = Integer.parseInt(getUserInput());
                menu = Integer.parseInt(getUserInput());                
                //TODO �� �޴� ���� �� �ؾ� �� �� ����
                switch ( menu ) {
                case 1:     // ���� ����
                    System.out.print( "\n���¹�ȣ : " );
                    String account = getUserInput();
                    System.out.print( "������ : " );
                    String name = getUserInput();
                    System.out.print( "���� �Ա� : " );
                    int balance = Integer.parseInt(getUserInput());            
                    //Account acc = null; �� ���ֱ⶧���� �������Է�
                    acc = new Account(account, name, balance);
                    break;
                    
 
                    
                case 2:     // ���� ���� ���
                	if(acc == null) {
                		throw new AccountNotFoundException("���� ������ �����ϴ�.");
                	} else {                		    	
                      System.out.println(acc);
                	}
                    break;
                case 3:     // �Ա�
                	if(acc == null) {
                		throw new AccountNotFoundException("���� ������ �����ϴ�.");
                	}
                    System.out.print( "�Ա��� �ݾ� : ");
                    int balance1  = Integer.parseInt(getUserInput());
                    //acc(��������+balance) + balance1 = �Էµ� �ݾ׿� + �Ա��Ѱ��� =
                    acc.deposit(balance1);
                    break;
                case 4:     // ���
                	//���������� �Էµ����� �ʾ�����
                	if(acc == null) {
                		throw new AccountNotFoundException("���� ������ �����ϴ�.");
                	}
                	//���������� �Էµ������� �Էµȱݾ׿� - ����Ѱ��� =
                    System.out.print( "����� �ݾ� : " );
                    int balance2  = Integer.parseInt(getUserInput());
                    acc.withdraw(balance2);
                    break;
                case 9:     // ����
                    System.out.println( "�����մϴ�." );
                    break;
                default:
                    System.out.println( "[����] �޴��� �߸� �Է��Ͽ����ϴ�." );
                    break;
                }
                
                //TODO catch ����ȭ (������ ���� ��Ȳ ����)
            } catch (InvalidValueException e ) {
               System.out.println(e.getMessage());// AccountŬ������ �Էµ�����.                   	
           } catch (NumberFormatException d) {
        	   System.out.println("[����] �޴��� ���ڷ� �Է��ؾ��մϴ�.");
           } catch (AccountNotFoundException e) {
        	   System.out.println(e.getMessage()); // case 3,4�� �Է�
           } catch (Exception e) {
        	   
           }
          
        }
    }
    
    private static void printMenu() {
        System.out.println( "\n===== < �޴� > =====" );
        System.out.println( " 1. ���� ����" );
        System.out.println( " 2. ���� ���� ���" );
        System.out.println( " 3. �Ա�" );
        System.out.println( " 4. ���" );
        System.out.println( " 9. ����" );
        System.out.println( "===================" );
        System.out.print( ">> �޴� : " );
    }
    
    public static String getUserInput() {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = null;
        
        try {
            inputString = br.readLine();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
        return inputString;
    }
}