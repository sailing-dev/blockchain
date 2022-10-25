/*
 * Copyright (C) 2021 Flicknplay
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.andtv.flicknplay.workbrowse.presentation.presenter

import com.andtv.flicknplay.presentation.di.annotation.ActivityScope
import com.andtv.flicknplay.presentation.presenter.AutoDisposablePresenter
import com.andtv.flicknplay.route.splash.SplashRoute
import javax.inject.Inject

/**
 * Copyright (C) Flicknplay 04-05-2018.
 */
@ActivityScope
class MainPresenter @Inject constructor(
    private val splashRoute: SplashRoute
        // private val loadRecommendationUseCase: LoadRecommendationUseCase,
        // private val rxScheduler: RxScheduler
) : AutoDisposablePresenter() {

    fun getSplashRoute() =
            splashRoute.buildSplashRoute()

    fun loadRecommendations() {
        /*loadRecommendationUseCase()
                .subscribeOn(rxScheduler.ioScheduler)
                .observeOn(rxScheduler.mainScheduler)
                .subscribe({ }, {
                    Timber.e(it, "Error while loading the recommendations")
                })
                .addTo(compositeDisposable)*/
    }
}
