/**
 *
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.myreader.component;


import com.myreader.ui.activity.BookDiscussionDetailActivity;
import com.myreader.ui.activity.BookHelpDetailActivity;
import com.myreader.ui.activity.BookReviewDetailActivity;
import com.myreader.ui.fragment.BookDiscussionFragment;
import com.myreader.ui.fragment.BookHelpFragment;
import com.myreader.ui.fragment.BookReviewFragment;
import com.myreader.ui.fragment.GirlBookDiscussionFragment;

import dagger.Component;

/**
 * @author yuyh.
 * @date 16/9/2.
 */
@Component(dependencies = AppComponent.class)
public interface CommunityComponent {

    BookDiscussionFragment inject(BookDiscussionFragment fragment);

    BookDiscussionDetailActivity inject(BookDiscussionDetailActivity activity);

    BookReviewFragment inject(BookReviewFragment fragment);

    BookReviewDetailActivity inject(BookReviewDetailActivity activity);

    BookHelpFragment inject(BookHelpFragment fragment);

    BookHelpDetailActivity inject(BookHelpDetailActivity activity);

    GirlBookDiscussionFragment inject(GirlBookDiscussionFragment fragment);
}
