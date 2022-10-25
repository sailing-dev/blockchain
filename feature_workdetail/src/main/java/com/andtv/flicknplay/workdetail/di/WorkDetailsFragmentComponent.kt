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

package com.andtv.flicknplay.workdetail.di

import com.andtv.flicknplay.model.presentation.model.WorkViewModel
import com.andtv.flicknplay.presentation.di.annotation.FragmentScope
import com.andtv.flicknplay.workdetail.di.module.MovieRemoteDataSourceModule
import com.andtv.flicknplay.workdetail.di.module.TvShowRemoteDataSourceModule
import com.andtv.flicknplay.workdetail.presentation.presenter.WorkDetailsPresenter
import com.andtv.flicknplay.workdetail.presentation.ui.fragment.WorkDetailsFragment
import dagger.BindsInstance
import dagger.Subcomponent

/**
 *
 */
@FragmentScope
@Subcomponent(
        modules = [
            MovieRemoteDataSourceModule::class,
            TvShowRemoteDataSourceModule::class
        ]
)
interface WorkDetailsFragmentComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance view: WorkDetailsPresenter.View,
            @BindsInstance workViewModel: WorkViewModel
        ): WorkDetailsFragmentComponent
    }

    fun inject(workDetailsFragment: WorkDetailsFragment)
}
