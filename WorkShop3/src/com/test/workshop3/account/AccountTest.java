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
                //TODO 각 메뉴 선택 시 해야 할 일 구현
                switch ( menu ) {
                case 1:     // 계좌 생성
                    System.out.print( "\n계좌번호 : " );
                    String account = getUserInput();
                    System.out.print( "예금주 : " );
                    String name = getUserInput();
                    System.out.print( "최초 입금 : " );
                    int balance = Integer.parseInt(getUserInput());            
                    //Account acc = null; 로 되있기때문에 생성자입력
                    acc = new Account(account, name, balance);
                    break;
                    
 
                    
                case 2:     // 계좌 정보 출력
                	if(acc == null) {
                		throw new AccountNotFoundException("계좌 정보가 없습니다.");
                	} else {                		    	
                      System.out.println(acc);
                	}
                    break;
                case 3:     // 입금
                	if(acc == null) {
                		throw new AccountNotFoundException("계좌 정보가 없습니다.");
                	}
                    System.out.print( "입금할 금액 : ");
                    int balance1  = Integer.parseInt(getUserInput());
                    //acc(계좌정보+balance) + balance1 = 입력된 금액에 + 입금한가격 =
                    acc.deposit(balance1);
                    break;
                case 4:     // 출금
                	//계좌정보가 입력되있지 않았을때
                	if(acc == null) {
                		throw new AccountNotFoundException("계좌 정보가 없습니다.");
                	}
                	//계좌정보가 입력되있을때 입력된금액에 - 출금한가격 =
                    System.out.print( "출금할 금액 : " );
                    int balance2  = Integer.parseInt(getUserInput());
                    acc.withdraw(balance2);
                    break;
                case 9:     // 종료
                    System.out.println( "종료합니다." );
                    break;
                default:
                    System.out.println( "[에러] 메뉴를 잘못 입력하였습니다." );
                    break;
                }
                
                //TODO catch 세분화 (각각의 예외 상황 별로)
            } catch (InvalidValueException e ) {
               System.out.println(e.getMessage());// Account클래스에 입력되있음.                   	
           } catch (NumberFormatException d) {
        	   System.out.println("[에러] 메뉴는 숫자로 입력해야합니다.");
           } catch (AccountNotFoundException e) {
        	   System.out.println(e.getMessage()); // case 3,4에 입력
           } catch (Exception e) {
        	   
           }
          
        }
    }
    
    private static void printMenu() {
        System.out.println( "\n===== < 메뉴 > =====" );
        System.out.println( " 1. 계좌 생성" );
        System.out.println( " 2. 계좌 정보 출력" );
        System.out.println( " 3. 입금" );
        System.out.println( " 4. 출금" );
        System.out.println( " 9. 종료" );
        System.out.println( "===================" );
        System.out.print( ">> 메뉴 : " );
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