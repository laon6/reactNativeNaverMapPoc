#import "NaverMapViewManager.h"
#import <NMapsMap/NMFMapView.h>

@implementation NaverMapViewManager

RCT_EXPORT_MODULE(NaverMapView)

- (UIView *)view
{
    NMFMapView *mapView = [[NMFMapView alloc] initWithFrame:CGRectZero];
    return mapView;
}

@end
