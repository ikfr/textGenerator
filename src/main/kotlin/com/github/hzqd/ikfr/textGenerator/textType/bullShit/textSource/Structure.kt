package com.github.hzqd.ikfr.textGenerator.textType.bullShit.textSource

import arrow.core.None
import arrow.core.Option

data class Structure (
    var famous: Option<List<String>> = None,
    var bosh: Option<List<String>> = None,
    var after: Option<List<String>> = None,
    var before: Option<List<String>> = None
)