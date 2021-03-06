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
package com.huawei.esdk.ivs.domain.model.bean;

public class WideDynamic
{
    private int wideDynamicMode; // 宽动态模式 0-关闭；1-开启
    
    private int wideDynamicLevel; // 宽动态等级 0-20
    
    private String reserve; // 保留字段
    
    public int getWideDynamicMode()
    {
        return wideDynamicMode;
    }
    
    public void setWideDynamicMode(int wideDynamicMode)
    {
        this.wideDynamicMode = wideDynamicMode;
    }
    
    public int getWideDynamicLevel()
    {
        return wideDynamicLevel;
    }
    
    public void setWideDynamicLevel(int wideDynamicLevel)
    {
        this.wideDynamicLevel = wideDynamicLevel;
    }
    
    public String getReserve()
    {
        return reserve;
    }
    
    public void setReserve(String reserve)
    {
        this.reserve = reserve;
    }
}
