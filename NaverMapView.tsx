import React from 'react';
import { requireNativeComponent, ViewProps } from 'react-native';

interface NaverMapViewProps extends ViewProps {}

const NaverMapView = requireNativeComponent<NaverMapViewProps>('NaverMapView');

const MapView: React.FC<NaverMapViewProps> = (props) => {
  return <NaverMapView {...props} />;
};

export default MapView;
