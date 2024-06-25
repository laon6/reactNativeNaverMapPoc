import React from 'react';
import { SafeAreaView, StyleSheet } from 'react-native';
import MapView from './NaverMapView';

const App = () => {
  return (
    <SafeAreaView style={styles.container}>
      <MapView style={styles.map} />
    </SafeAreaView>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
  map: {
    flex: 1,
  },
});

export default App;
