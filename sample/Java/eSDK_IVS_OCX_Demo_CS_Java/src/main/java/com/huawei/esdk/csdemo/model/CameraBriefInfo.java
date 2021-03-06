/**
 * Copyright 2015 Huawei Technologies Co., Ltd. All rights reserved.
 * eSDK is licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   
 * http://www.apache.org/licenses/LICENSE-2.0
 *   
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.huawei.esdk.csdemo.model;

import java.util.ArrayList;
import java.util.List;

import com.sun.jna.Structure;

/**
 * 视频子设备列表简要信息
 * <p>
 * @author  cWX191990
 * @see  [相关类/方法]
 * @since  eSDK IVS V100R003C00
 */
public class CameraBriefInfo extends Structure
{
    
    public static class ByReference extends CameraBriefInfo implements Structure.ByReference
    {
    }
    
    public static class ByValue extends CameraBriefInfo implements Structure.ByValue
    {
    }
    
    public CameraBriefInfo()
    {
        super(Structure.ALIGN_NONE);
    }
    
    /**
     * 设备编码
     */
    public byte[] code = new byte[64];
    
    /**
     * 摄像机名称
     */
    public byte[] name = new byte[192];
    
    /**
     * 所属设备组编码
     */
    public byte[] deviceGroupCode = new byte[128];
    
    /**
     * 父设备编码
     */
    public byte[] parentCode = new byte[64];
    
    /**
     * 域编码
     */
    public byte[] domainCode = new byte[32];
    
    /**
     * 主设备型号
     */
    public byte[] deviceModelType = new byte[32];
    
    /**
     * 设备提供商类型: "HUAWEI" "HIK" "DAHUA"
     */
    public byte[] vendorType = new byte[32];
    
    /**
     * 主设备类型：参考 IVS_MAIN_DEVICE_TYPE
     */
    public int deviceFormType;
    
    /**
     * 摄像机类型
     */
    public int type;
    
    /**
     * 摄像机安装位置描述
     */
    public byte[] cameraLocation = new byte[256];
    
    /**
     * 摄像机扩展状态：1 – 正常   2 – 视频丢失
     */
    public int cameraStatus;
    
    /**
     * 设备状态：0-离线，1-在线，2-休眠
     */
    public int status;
    
    /**
     * 网络类型 0-有线  1-无线
     */
    public int netType;
    
    /**
     * 是否支持智能分析  0-不支持 1-支持
     */
    public int supportIntelligent;
    
    /**
     * 随路音频是否启用 0-停用 1-启用
     */
    public int enableVoice;
    
    /**
     * 设备所属NVR编码, 表示该设备被该NVR管理
     */
    public byte[] nvrCode = new byte[32];
    
    /**
     * 设备创建时间
     */
    public byte[] deviceCreateTime = new byte[20];
    
    /**
     * 是否为外部域 0-否  1-是
     */
    public int isExDomain;
    
    /**
     * 前端IP
     */
    public byte[] deviceIp = new byte[64];
    
    /**
     * 保留字段
     */
    public byte[] reserve = new byte[32];
    
    @Override
    protected List<String> getFieldOrder()
    {
        List<String> list = new ArrayList<String>();
        list.add("code");
        list.add("name");
        list.add("deviceGroupCode");
        list.add("parentCode");
        list.add("domainCode");
        list.add("deviceModelType");
        list.add("vendorType");
        list.add("deviceFormType");
        list.add("type");
        list.add("cameraLocation");
        list.add("cameraStatus");
        list.add("status");
        list.add("netType");
        list.add("supportIntelligent");
        list.add("enableVoice");
        list.add("nvrCode");
        list.add("deviceCreateTime");
        list.add("isExDomain");
        list.add("deviceIp");
        list.add("reserve");
        return list;
    }
    
}
