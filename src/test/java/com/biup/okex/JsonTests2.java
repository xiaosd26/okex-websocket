package com.biup.okex;

import com.biup.okex.util.OrderInfoStatus;
import org.junit.Test;

public class JsonTests2 {

    @Test
    public void test0() {
        System.out.println("test");
        System.out.println("test3");
        System.out.println("test4");
        System.out.println("test6");
        System.out.println("test5");
        String address="0xb384455a41d68f020a1bab9fed36191291ac7431";
        String start=address.substring(0,2);
        String charAndDigit="^[A-Za-z0-9]+$";
        Boolean dig= address.matches(charAndDigit);
        System.out.println(address.length());
        System.out.println(dig);
        System.out.println(start);
        System.out.println(address.startsWith("0x"));
    }


    private int formOrderStatus(Integer status) {
        if (status.equals(-1)) {//已撤销
            status = OrderInfoStatus.CANCELED.value;
        } else if (status.equals(0)) {//未成交
            status = OrderInfoStatus.NEW.value;
        } else if (status.equals(1)) {//部分成交
            status = OrderInfoStatus.PART_FILLED.value;
        } else if (status.equals(2)) {//完全成交
            status = OrderInfoStatus.FILLED.value;
        } else if (status.equals(3)) { // 撤单处理中
            status = OrderInfoStatus.PENDING_CANCEL.value;
        } else {
            status = OrderInfoStatus.EXCEPTION_CANCEL.value;
        }
        return status;
    }

}
