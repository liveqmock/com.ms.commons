/*
 * Copyright 2011-2016 ZXC.com All right reserved. This software is the confidential and proprietary information of
 * ZXC.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with ZXC.com.
 */
package com.ms.commons.udas.interfaces;

import java.io.Serializable;

/**
 * @author zxc Apr 12, 2013 5:31:52 PM
 */
public interface DealHandler {

    Serializable get(String key);
}
