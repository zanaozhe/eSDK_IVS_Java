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
package com.huawei.esdk.ivs.test.service;

import com.huawei.esdk.ivs.test.bean.GetPTZPresetListResponse;
import com.huawei.esdk.ivs.test.bean.IVSSDKResponse;
import com.huawei.esdk.ivs.test.bean.MediaAddress;
import com.huawei.esdk.ivs.test.bean.OperationLogInfos;
import com.huawei.esdk.ivs.test.bean.PTZControlInfo;
import com.huawei.esdk.ivs.test.bean.PTZPresetInfo;
import com.huawei.esdk.ivs.test.bean.PlaybackParam;
import com.huawei.esdk.ivs.test.bean.QueryUnifiedFormat;
import com.huawei.esdk.ivs.test.bean.RealplayParam;
import com.huawei.esdk.ivs.test.bean.StartPlatformPlayBackByIPResponse;
import com.huawei.esdk.ivs.test.bean.StartRealPlayByIPExResponse;

public interface BusinessManagerServiceEx
{
    IVSSDKResponse<PTZControlInfo> ptzControlWithLockerInfo(String cameraCode, Integer controlCode,
        String controlPara1, String controlPara2);

    IVSSDKResponse<Integer> ptzControl(String cameraCode, Integer controlCode, String controlPara1, String controlPara2);

    Integer modifyPTZPreset(String cameraCode, PTZPresetInfo ptzPresetInfo);

    IVSSDKResponse<GetPTZPresetListResponse> getPTZPresetList(String cameraCode);

    Integer deletePTZPreset(String cameraCode, Integer presetIndex);

    IVSSDKResponse<Integer> addPTZPreset(String cameraCode, String presetName);

    IVSSDKResponse<StartPlatformPlayBackByIPResponse> startPlatformPlayBackByIP(String cameraCode, PlaybackParam playbackParam,
        MediaAddress mediaAddrDst);
    
    Integer stopPlatformPlayBackByIP(Long handle);

    IVSSDKResponse<StartRealPlayByIPExResponse> startRealPlayByIPEx(String cameraCode, RealplayParam realplayParam,
        MediaAddress mediaAddrDst);
    
    Integer stopRealPlayByIPEx(Long handle);

    Integer startPlatformRecord(String cameraCode, Integer recordTime);

    Integer stopPlatformRecord(String cameraCode);

    IVSSDKResponse<OperationLogInfos> getOperationLog(QueryUnifiedFormat unifiedQuery);
    
    Integer platformPlayBackPauseByIP(Long playHandle);
    
    Integer platformPlayBackResumeByIP(Long playHandle);
    
    Integer setPlayBackTimeByIP(Long playHandle, Integer time);
    
    Integer setPlayBackSpeedByIP(Long playHandle, Float speed);

}
