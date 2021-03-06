package app.ericn.android_common

import android.app.Application
import dagger.Module
import dagger.Provides

@Module
class MiscModule {
    @Provides
    fun provideStringProvider(context: Application): StringProvider {
        return StringProviderImpl(context.resources)
    }

    @Provides
    fun provideImageLoader(): ImageLoader {
        return GlideImageLoader()
    }
}