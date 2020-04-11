package com.dinakar.mask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaskMobileNumberTest {
    @Test
    public void canMobileNumberBeNull() {
        String mobileNumber = null;
        assertNull(MaskMobileNumber.maskMobileNum(null), "should not be null");
    }

    @Test
    public void maskMobileNumber() {
        String mobileNumber = "(456) 678-7896";
        assertNotNull(MaskMobileNumber.maskMobileNum(mobileNumber),"should not be null");
        assertEquals(MaskMobileNumber.maskMobileNum(mobileNumber), "(456) ***-7896", "should be equal to");

    }
    @Test
    public void mobileNumberEmpty(){
        String mobileNumber = "";
        assertNull(MaskMobileNumber.maskMobileNum(mobileNumber),"Should not be empty");
    }
    @Test
    public void mobileNumberLessThanExpected(){
        String mobileNumber = "123445";
        assertNull(MaskMobileNumber.maskMobileNum(mobileNumber),"Should not be less than Expected");
    }
    @Test
    public void mobileNumberMoreThanExpected(){
        String mobileNumber = "01234567890123";
        assertNull(MaskMobileNumber.maskMobileNum(mobileNumber),"Should not be more than Expected");
    }


}