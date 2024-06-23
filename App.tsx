import React from 'react';
import {Button, NativeModules, View} from 'react-native';

const {NaverMapModule} = NativeModules;

const App = () => {
  return (
    <View style={{flex: 1, justifyContent: 'center', alignItems: 'center'}}>
      <Button title="Show Naver Map" onPress={() => NaverMapModule.showMap()} />
    </View>
  );
};

export default App;
