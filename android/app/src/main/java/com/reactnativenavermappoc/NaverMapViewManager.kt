package com.reactnativenavermappoc

import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.naver.maps.map.NaverMapSdk
import com.naver.maps.map.MapView
import com.reactnativenavermappoc.BuildConfig

class NaverMapViewManager : SimpleViewManager<MapView>() {

    override fun getName(): String {
        return "NaverMapView"
    }

    override fun createViewInstance(reactContext: ThemedReactContext): MapView {
        val clientId = BuildConfig.NAVER_CLIENT_ID
        NaverMapSdk.getInstance(reactContext).setClient(
                NaverMapSdk.NaverCloudPlatformClient(clientId)
        )
        return MapView(reactContext)
    }
}
