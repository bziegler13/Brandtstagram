# Project 3 - *brandtstagram*

**brandtstagram** is a photo sharing app similar to Instagram but using Parse as its backend.

Time spent: **4** hours spent in total

## User Stories

The following **required** functionality is completed:

- [X] User can sign up to create a new account using Parse authentication.
- [X] User can log in and log out of his or her account.
- [X] The current signed in user is persisted across app restarts.
- [X] User can take a photo, add a caption, and post it to "Instagram".

The following **optional** features are implemented:

- [X] User sees app icon in home screen and styled bottom navigation view
- [ ] Style the feed to look like the real Instagram feed.
- [X] After the user submits a new post, show an indeterminate progress bar while the post is being uploaded to Parse.

The following **additional** features are implemented:

- [X] Improved coloring and style
- [X] Field validation and button handling when fields are not valid

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='https://user-images.githubusercontent.com/47534734/156319677-b3aee0d4-6571-4837-83f0-3bcb2995876a.GIF' title='Video Walkthrough' width='' alt='Video Walkthrough' />

![40A8723F-8F9F-4D3E-AE01-A1B7659D2C60]()



## Notes

I decided to use the LoginActivity template from Android Studio. This gave me some difficulties when trying to implement the Parse login calls since the methods were deconstructed in a way that did not let me use the LogInInBackground method correctly. I ended up cutting a lot of that code and just implemented the logic handling in the LoginActivity.java file itself.

## Open-source libraries used

- [Android Async HTTP](https://github.com/codepath/CPAsyncHttpClient) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Android

## License

    Copyright [yyyy] [name of copyright owner]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
