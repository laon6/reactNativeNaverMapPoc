package com.reactnativenavermappoc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.naver.maps.map.MapFragment
import com.naver.maps.map.NaverMap
import com.naver.maps.map.OnMapReadyCallback
import com.naver.maps.map.NaverMapSdk

class MapActivity : AppCompatActivity(), OnMapReadyCallback {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        // BuildConfig에서 클라이언트 ID 로드
        val clientId = BuildConfig.NAVER_CLIENT_ID

        // Naver Map SDK 초기화
        NaverMapSdk.getInstance(this).setClient(
                NaverMapSdk.NaverCloudPlatformClient(clientId)
        )

        // MapFragment 초기화
        val fm: FragmentManager = supportFragmentManager
        var mapFragment: MapFragment? = fm.findFragmentById(R.id.map_fragment) as MapFragment?

        if (mapFragment == null) {
            mapFragment = MapFragment.newInstance()
            fm.beginTransaction().add(R.id.map_fragment, mapFragment).commit()
        }

        mapFragment?.getMapAsync(this) // 안전 호출 사용
    }

    override fun onMapReady(naverMap: NaverMap) {
        // 네이버 맵이 준비되었을 때 추가 설정을 여기에 작성
    }
}
