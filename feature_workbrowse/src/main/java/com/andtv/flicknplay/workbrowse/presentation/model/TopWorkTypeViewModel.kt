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

package com.andtv.flicknplay.workbrowse.presentation.model

import androidx.annotation.StringRes
import com.andtv.flicknplay.workbrowse.R

/**
 * Copyright (C) 2021 Flicknplay.
 */
enum class TopWorkTypeViewModel(@StringRes val resource: Int) {
    FAVORITES_MOVIES(R.string.favorites),
    CONTINUE_WATCHING(R.string.continue_watching),
   // NOW_PLAYING_MOVIES(R.string.now_playing),
    POPULAR_MOVIES(R.string.popular),
    TOP_RATED_MOVIES(R.string.top_rated),
    UP_COMING_MOVIES(R.string.up_coming),
    AIRING_TODAY_TV_SHOWS(R.string.airing_today),
   // ON_THE_AIR_TV_SHOWS(R.string.on_the_air),
    POPULAR_TV_SHOWS(R.string.popular),
    TOP_RATED_TV_SHOWS(R.string.top_rated);
}
