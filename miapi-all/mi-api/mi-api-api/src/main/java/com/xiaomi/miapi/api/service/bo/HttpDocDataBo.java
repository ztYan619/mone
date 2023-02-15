package com.xiaomi.miapi.api.service.bo;


import lombok.Data;

import java.io.Serializable;
/**
 * @author dongzhenxing
 * @date 2023/02/08
 */
@Data
public class HttpDocDataBo implements Serializable {
    private String address;
    private String httpApiModuleInfo;
    private String httpApiModuleListAndApiInfo;
    private String httpApiParamsResponseInfo;
}
