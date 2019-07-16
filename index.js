import { NativeModules } from 'react-native';

const { RNBeepTone } = NativeModules;
export const start = RNBeepTone.start;
export const stop = RNBeepTone.stop;
