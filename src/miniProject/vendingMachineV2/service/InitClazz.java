package miniProject.vendingMachineV2.service;

import miniProject.vendingMachineV2.vo.ProductVO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InitClazz {
    
    public static void printMenu() { // 리스트 안의 제품목록 출력

        System.out.println("======================== 메뉴 ========================");
        Iterator<ProductVO> iterator = lists.iterator(); // Iterator 반복자 : 컬렉션을 순회하면서 요소에 접근
        while (iterator.hasNext()) { // 컬렉션을 돌면서 다음 요소가 있는 동안
            System.out.println(iterator.next().toString()); // next(): 현재 요소를 반환하고 다음 요소로 이동 // toString(): 문자열로 변환해서 출력
        }
        System.out.println("=====================================================");
        
    }
    
    public static int remainMoney = 0; // 전체가 공유하는 현재 잔액
    
    public static List<ProductVO> lists = new ArrayList<>(); // 전체가 공유하는 제품 리스트


}
