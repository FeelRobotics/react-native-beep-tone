#import "RNBeepTone.h"
#import "TGSineWaveToneGenerator.h"

@implementation RNBeepTone

TGSineWaveToneGenerator *generator = NULL;

RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(start:(nonnull NSNumber *)volume)
{
    if (generator) {
        [generator stop];
        generator = NULL;
    }

    float amplitude = [volume doubleValue]*SINE_WAVE_TONE_GENERATOR_AMPLITUDE_FULL/100;
    generator = [[TGSineWaveToneGenerator alloc]
                 initWithFrequency:440
                 amplitude:amplitude];
    [generator play];
}

RCT_EXPORT_METHOD(stop)
{
    [generator stop];
}

@end
