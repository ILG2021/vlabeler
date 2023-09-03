@file:Suppress("REDUNDANT_ELSE_IN_WHEN")

package com.sdercolin.vlabeler.ui.string

import com.sdercolin.vlabeler.ui.string.Strings.*

fun Strings.zhHans(): String? = when (this) {
    AppName -> "vLabeler"
    MenuFile -> "文件"
    MenuFileNewProject -> "新建项目..."
    MenuFileOpen -> "打开..."
    MenuFileOpenRecent -> "打开最近使用"
    MenuFileOpenRecentClear -> "清除最近使用记录"
    MenuFileSave -> "保存"
    MenuFileSaveAs -> "另存为..."
    MenuFileProjectSetting -> "项目设置..."
    MenuFileImport -> "导入..."
    MenuFileExport -> "导出..."
    MenuFileExportOverwrite -> "覆盖导出"
    MenuFileExportOverwriteAll -> "覆盖导出全部"
    MenuFileInvalidateCaches -> "清除缓存"
    MenuFileClose -> "关闭"
    MenuEdit -> "编辑"
    MenuEditUndo -> "撤销"
    MenuEditRedo -> "重做"
    MenuEditTools -> "工具"
    MenuEditToolsCursor -> "光标"
    MenuEditToolsScissors -> "剪刀"
    MenuEditToolsPan -> "平移"
    MenuEditToolsPlayback -> "播放"
    MenuEditRenameEntry -> "编辑当前条目名..."
    MenuEditDuplicateEntry -> "创建当前条目的副本..."
    MenuEditRemoveEntry -> "删除当前条目"
    MenuEditMoveEntry -> "移动当前条目至..."
    MenuEditToggleDone -> "对当前条目切换完成状态"
    MenuEditToggleStar -> "对当前条目切换星标状态"
    MenuEditEditTag -> "编辑当前条目的标签..."
    MenuEditMultipleEditMode -> "编辑所有互相连接的条目"
    MenuView -> "视图"
    MenuViewToggleMarker -> "显示参数控制线"
    MenuViewPinEntryList -> "固定条目列表"
    MenuViewPinEntryListLocked -> "禁止拖拽固定条目列表的边界"
    MenuViewToggleProperties -> "显示属性"
    MenuViewToggleToolbox -> "显示工具箱"
    MenuViewToggleTimescaleBar -> "显示时间标尺"
    MenuViewOpenSampleList -> "打开采样列表"
    MenuViewVideo -> "显示相关视频"
    MenuViewVideoOff -> "关闭"
    MenuViewVideoEmbedded -> "内嵌式"
    MenuViewVideoNewWindow -> "在新窗口"
    MenuNavigate -> "导航"
    MenuNavigateOpenLocation -> "打开目录"
    MenuNavigateOpenLocationRootDirectory -> "项目根采样目录"
    MenuNavigateOpenLocationModuleDirectory -> "当前子项目的采样目录"
    MenuNavigateOpenLocationProjectLocation -> "项目文件所在目录"
    MenuNavigateNextEntry -> "下一个条目"
    MenuNavigatePreviousEntry -> "上一个条目"
    MenuNavigateNextSample -> "下一个采样"
    MenuNavigatePreviousSample -> "上一个采样"
    MenuNavigateNextModule -> "下一个子项目"
    MenuNavigatePreviousModule -> "上一个子项目"
    MenuNavigateJumpToEntry -> "跳转到条目..."
    MenuNavigateScrollFit -> "滚动至显示当前条目"
    MenuTools -> "工具"
    MenuToolsBatchEdit -> "批量编辑"
    MenuToolsBatchEditQuickLaunchManager -> "槽位设置"
    MenuToolsBatchEditQuickLaunch -> "槽位 %d：%s"
    MenuToolsBatchEditShowDisabledItems -> "显示当前项目下不可用的插件"
    MenuToolsBatchEditManagePlugins -> "管理插件..."
    MenuToolsPrerender -> "预渲染所有图表..."
    MenuToolsSyncSample -> "转换所有相对于采样文件尾的数值..."
    MenuToolsRecycleMemory -> "回收内存"
    MenuSettings -> "设置"
    MenuSettingsPreferences -> "偏好设置..."
    MenuSettingsLabelers -> "标注器..."
    MenuSettingsTemplatePlugins -> "模板生成器..."
    MenuSettingsTracking -> "统计使用数据..."
    MenuHelp -> "帮助"
    MenuHelpCheckForUpdates -> "检查更新..."
    MenuHelpOpenLogDirectory -> "打开日志目录"
    MenuHelpOpenHomePage -> "打开 vLabeler 主页"
    MenuHelpOpenLatestRelease -> "打开最新版本的发布页面"
    MenuHelpOpenGitHub -> "打开 GitHub 仓库页面"
    MenuHelpJoinDiscord -> "加入 Discord"
    MenuHelpAbout -> "关于"
    CommonOkay -> "确定"
    CommonApply -> "应用"
    CommonCancel -> "取消"
    CommonYes -> "是"
    CommonNo -> "否"
    CommonWarning -> "警告"
    CommonError -> "错误"
    CommonDetails -> "详情"
    CommonOthers -> "其他"
    CommonPrevious -> "上一页"
    CommonNext -> "下一页"
    CommonFinish -> "完成"
    CommonSelect -> "选择"
    CommonOpen -> "打开"
    CommonSave -> "保存"
    CommonInputErrorPromptNumber -> "请输入一个数字。"
    CommonInputErrorPromptInteger -> "请输入一个整数。"
    CommonInputErrorPromptNumberRange -> "请输入一个介于 %s 与 %s 之间的数字。"
    CommonInputErrorPromptNumberMin -> "请输入一个不小于 %s 的数字。"
    CommonInputErrorPromptNumberMax -> "请输入一个不大于 %s 的数字。"
    CommonRootModuleName -> "（根）"
    StarterStart -> "开始"
    StarterNewProject -> "新建项目..."
    StarterOpen -> "打开..."
    StarterRecent -> "最近使用"
    StarterRecentEmpty -> "最近使用的项目将会显示在这里。"
    StarterRecentDeleted -> "该项目已被删除。"
    StarterNewSampleDirectory -> "采样目录"
    StarterNewWorkingDirectory -> "项目文件存放位置"
    StarterNewProjectTitle -> "新建项目"
    StarterNewProjectName -> "项目名"
    StarterNewProjectNameWarning -> "该项目文件已存在，继续创建项目将会覆盖它。"
    StarterNewCacheDirectory -> "缓存目录"
    StarterNewLabelerCategory -> "类别"
    StarterNewLabeler -> "标注器"
    StarterNewTemplatePlugin -> "模板生成器"
    StarterNewTemplatePluginNone -> "无"
    StarterNewInputFile -> "输入文件 (.%s)"
    StarterNewEncoding -> "编码"
    StarterNewAutoExport -> "自动导出"
    StarterNewAutoExportHelp -> "保存时，自动将项目覆盖导出到输入文件（如未指定输入文件，将自动导出到由标注器指定的位置）"
    StarterNewWarningSelfConstructedLabelerWithTemplatePlugin ->
        "您正在尝试在一个管理多个子项目的标注器上使用模板生成器。" +
            "这是危险的，因为它可能会用生成的条目覆盖所有现有的标注文件。请再次确认设置是否符合您的需求。"
    StarterNewDirectoryPage -> "目录设置"
    StarterNewLabelerPage -> "标注器设置"
    StarterNewDataSourcePage -> "数据源设置"
    StarterNewContentType -> "创建自..."
    StarterNewContentTypeDefault -> "默认"
    StarterNewContentTypeFile -> "文件"
    StarterNewContentTypePlugin -> "模板生成器"
    StarterNewAdvancedSettings -> "高级设置"
    SampleListIncludedHeader -> "项目中使用到的采样"
    SampleListIncludedItemEntryCountSingle -> "%d 条目"
    SampleListIncludedItemEntryCountPlural -> "%d 条目"
    SampleListExcludedHeader -> "项目中未使用到的采样"
    SampleListExcludedPlaceholder -> "采样目录中的所有采样文件都已被项目使用。"
    SampleListEntryHeader -> "条目"
    SampleListEntriesPlaceholderUnselected -> "在左边选择一个采样以查看其关联到的条目。"
    SampleListEntriesPlaceholderNoEntry -> "该采样没有关联到任何条目。"
    SampleListEntriesPlaceholderNoEntryButton -> "创建默认条目"
    SampleListCreateDefaultForAllButton -> "为所有未使用到的采样创建默认条目"
    SampleListJumpToSelectedEntryButton -> "跳转到选中的条目"
    SampleListOpenSampleDirectoryButton -> "打开采样目录"
    SampleListCurrentModuleLabel -> "子项目："
    SampleListSampleDirectoryLabel -> "采样目录："
    SampleListSampleDirectoryRedirectButton -> "切换采样目录"
    PrerendererModuleText -> "渲染子项目 %d/%d..."
    PrerendererModuleTextFinished -> "渲染子项目 %d/%d... 完成"
    PrerendererSampleText -> "渲染采样文件 %d/%d..."
    PrerendererSampleTextFinished -> "渲染采样文件 %d/%d... 完成"
    PrerendererChartText -> "渲染图表 %d/%d..."
    PrerendererChartTextFinished -> "渲染图表 %d/%d... 完成"
    EditorRenderStatusLabel -> "%d/%d 渲染中..."
    ChooseSampleDirectoryDialogTitle -> "选择采样目录"
    ChooseWorkingDirectoryDialogTitle -> "选择项目文件存放位置"
    ChooseCacheDirectoryDialogTitle -> "选择缓存目录"
    ChooseInputFileDialogTitle -> "选择输入文件"
    OpenProjectDialogTitle -> "打开项目"
    SaveAsProjectDialogTitle -> "另存为项目"
    ImportDialogTitle -> "导入项目"
    ExportDialogTitle -> "导出项目"
    SetResolutionDialogDescription -> "请指定编辑器的画布分辨率（数据点数/像素）(%d ~ %d)"
    SetEntryPropertyDialogDescription -> "请输入本条目的属性 %s 的值。\n请注意您的输入值将不会受到限制，因此请务必自行确保其合法性。"
    AskIfSaveBeforeOpenDialogDescription -> "有未保存的变更。是否要在打开新项目前保存变更？"
    AskIfSaveBeforeExportDialogDescription -> "有未保存的变更。是否要在导出前保存变更？"
    AskIfSaveBeforeCloseDialogDescription -> "有未保存的变更。是否要在关闭当前项目前保存变更？"
    AskIfSaveBeforeExitDialogDescription -> "有未保存的变更。是否要在退出前保存变更？"
    InputEntryNameDialogDescription -> "请输入条目名"
    InputEntryNameDuplicateDialogDescription -> "请输入新条目名"
    InputEntryNameCutFormerDialogDescription -> "请输入切割后的前一个条目名"
    InputEntryNameCutLatterDialogDescription -> "请输入切割后的后一个条目名"
    EditEntryNameDialogExistingError -> "该条目名已存在。"
    MoveEntryDialogDescription -> "请输入条目 \"%1\$s\" 的新索引（%2\$d ~ %3\$d）"
    AskIfRemoveEntryDialogDescription -> "将要删除当前条目..."
    AskIfRemoveEntryLastDialogDescription ->
        "将要删除当前条目...\n" +
            "该条目是当前采样文件关联到的唯一条目。如果您想重新关联这个采样文件，请前往菜单 `视图` -> `采样列表`"
    AskIfLoadAutoSavedProjectDialogDescription -> "发现自动保存的项目文件。是否读取？该文件将会在您打开或创建别的项目时被删除。"
    AskIfRedirectSampleDirectoryDialogDescription ->
        "未找到当前子项目的采样目录(%s)，或该目录中不含有任何所需的采样文件。是否要重定向到其他目录？"
    PluginDialogTitle -> "vLabeler - 插件"
    PluginDialogInfoAuthor -> "作者：%s"
    PluginDialogInfoVersion -> "版本：%d"
    PluginDialogInfoContact -> "联系作者"
    PluginDialogDescriptionMin -> "最小：%s"
    PluginDialogDescriptionMax -> "最大：%s"
    PluginDialogDescriptionMinMax -> "最小：%s，最大：%s"
    PluginDialogExecute -> "执行"
    PluginDialogImportFromSavedParams -> "读取保存的默认参数"
    PluginDialogImportFromSlot -> "读取槽位 %1\$d：%2\$s 的参数"
    PluginDialogEmptySlotName -> "空"
    PluginDialogImportFromFile -> "从文件导入参数"
    PluginDialogImportSuccess -> "导入成功"
    PluginDialogImportFailure -> "无法导入该预设，可能是因为该预设并不匹配当前项目。"
    PluginDialogExportToSavedParams -> "保存为默认参数"
    PluginDialogExportToSlot -> "保存参数到槽位 %1\$d：%2\$s"
    PluginDialogExportToFile -> "导出参数到文件"
    PluginDialogExportSuccess -> "导出成功"
    PluginDialogExportFailure -> "无法导出该预设。"
    PluginEntrySelectorTextMatchTypeEquals -> "等于"
    PluginEntrySelectorTextMatchTypeContains -> "包含"
    PluginEntrySelectorTextMatchTypeStartsWith -> "以...开始"
    PluginEntrySelectorTextMatchTypeEndsWith -> "以...结束"
    PluginEntrySelectorTextMatchTypeRegex -> "正则表达式"
    PluginEntrySelectorNumberMatchTypeEquals -> "="
    PluginEntrySelectorNumberMatchTypeGreaterThan -> ">"
    PluginEntrySelectorNumberMatchTypeGreaterThanOrEquals -> ">="
    PluginEntrySelectorNumberMatchTypeLessThan -> "<"
    PluginEntrySelectorNumberMatchTypeLessThanOrEquals -> "<="
    PluginEntrySelectorPreservedSubjectSample -> "采样名（不含扩展名）"
    PluginEntrySelectorPreservedSubjectName -> "条目名"
    PluginEntrySelectorPreservedSubjectTag -> "标签"
    PluginEntrySelectorPreservedSubjectDone -> "完成状态"
    PluginEntrySelectorPreservedSubjectStar -> "星标状态"
    PluginEntrySelectorComparerValue -> "输入值"
    PluginEntrySelectorPreservedSubjectScript -> "表达式"
    PluginEntrySelectorPreviewSummaryError -> "输入值无效"
    PluginEntrySelectorPreviewSummaryInitializing -> "正在初始化..."
    PluginEntrySelectorPreviewSummary -> "已选中 %d/%d"
    PluginEntrySelectorPlaceholder -> "无筛选条件，将选中所有条目"
    EditorSubTitleMultiple -> "编辑采样 %2\$s 中的%1\$d个条目"
    FailedToLoadSampleFileError -> "无法读取该采样文件。它可能不存在，或是不支持的格式。"
    PluginRuntimeUnexpectedException -> "插件执行过程中发生了意外的错误。请联系插件作者以获取更多信息。"
    InvalidCreatedProjectException ->
        "新建的项目为无效项目。请检查您正在使用的标注器或插件的设置。如果问题仍然无法解决，请联系标注器或插件的作者以获取更多信息。"
    InvalidOpenedProjectException -> "无法打开该项目，因为其中包含无效的数据。详情请查看错误日志。"
    ProjectParseException ->
        "无法打开该项目。它可能已损坏，或者是由一个与当前版本不兼容的 vLabeler 版本创建的。" +
            "请尝试新建一个项目，并使用菜单 `文件` -> `导入...` 来导入该项目文件。"
    ProjectImportException -> "无法导入该文件。它可能不是有效的 vLabeler 项目文件。详情请查看错误日志。"
    ProjectUpdateOnSampleException -> "无法将项目中的数据与当前读取到的采样进行匹配。详情请查看错误日志。"
    InvalidEditedProjectException -> "此次编辑将导致项目数据无效。详情请查看错误日志。"
    CustomizableItemLoadingException -> "无法读取该自定义组件。"
    PluginRuntimeExceptionTemplate -> "插件运行时错误：%s"
    ProjectConstructorRuntimeExceptionTemplate -> "构建项目时的标注器运行时错误：%s"
    VideoComponentInitializationException ->
        "无法初始化视频组件。您需要在您的设备上安装 VLC 才能使用此功能。请阅读 README 中的 `集成视频` 部分以获取更多信息。"
    VideoFileNotFoundExceptionTemplate -> "未找到 %s 的同名视频文件（%s）"
    LabelerManagerTitle -> "标注器"
    LabelerManagerImportDialogTitle -> "导入标注器"
    TemplatePluginManagerTitle -> "模板生成器"
    TemplatePluginManagerImportDialogTitle -> "导入模板生成器"
    MacroPluginManagerTitle -> "批量编辑插件"
    MacroPluginManagerImportDialogTitle -> "导入批量编辑插件"
    MacroPluginReportDialogTitle -> "批量编辑执行结果"
    MacroPluginReportDialogCopy -> "复制"
    CustomizableItemManagerRemoveItemConfirm -> "确定要删除 \"%s\" 吗？该操作将从磁盘上删除相应的文件。"
    CustomizableItemManagerOpenDirectory -> "打开目录"
    CustomizableItemManagerReload -> "重新加载"
    CustomizableItemManagerLockedDescription -> "该组件是内建组件，无法删除。"
    PreferencesEditorImport -> "导入"
    PreferencesEditorImportDialogTitle -> "导入偏好设置"
    PreferencesEditorImportSuccess -> "导入成功。"
    PreferencesEditorImportFailure -> "无法导入该偏好设置文件。"
    PreferencesEditorExport -> "导出"
    PreferencesEditorExportSuccess -> "导出成功。"
    PreferencesEditorExportFailure -> "无法导出偏好设置到该文件。"
    PreferencesEditorExportDialogTitle -> "导出偏好设置"
    PreferencesEditorResetPage -> "重置该页的项目"
    PreferencesEditorResetAll -> "重置所有项目"
    PreferencesCharts -> "图表"
    PreferencesChartsDescription -> "编辑图表的渲染/显示。"
    PreferencesChartsCanvas -> "画布"
    PreferencesChartsCanvasDescription -> "编辑画布的基本设置。"
    PreferencesChartsCanvasResolution -> "画布分辨率"
    PreferencesChartsCanvasResolutionDescription ->
        "每个像素中包含的数据点的个数。" +
            "该数值与图表在屏幕上显示的范围所对应的时间长度成正比。"
    PreferencesChartsCanvasResolutionDefault -> "默认分辨率"
    PreferencesChartsCanvasResolutionStep -> "步长"
    PreferencesChartsMaxDataChunkSize -> "最大数据块大小"
    PreferencesChartsMaxDataChunkSizeDescription ->
        "一个图表数据块所能包含的最大数据点数。" +
            "该数值越大，图表在渲染过程中将被切分成越少的块。"
    PreferencesChartsWaveform -> "波形图"
    PreferencesChartsWaveformDescription -> "编辑波形图的渲染设置。"
    PreferencesChartsWaveformResampleDownTo -> "最大采样率（Hz）"
    PreferencesChartsWaveformResampleDownToDescription ->
        "超过该采样率的音频文件将被降采样至该数值(原文件不会被更改)。" +
            "您可以将其设为0来禁止降采样。"
    PreferencesChartsWaveformNormalize -> "音频标准化"
    PreferencesChartsWaveformNormalizeDescription -> "标准化将增加首次读取采样文件时的耗时，"
    PreferencesChartsWaveformUnitSize -> "点数/像素"
    PreferencesChartsWaveformUnitSizeDescription -> "该数值与图像质量成反比。"
    PreferencesChartsWaveformIntensityAccuracy -> "图像高度（像素）"
    PreferencesChartsWaveformYAxisBlankRate -> "纵向空白填充（%%）"
    PreferencesChartsWaveformColor -> "前景色"
    PreferencesChartsWaveformBackgroundColor -> "背景色"
    PreferencesChartsSpectrogram -> "频谱图"
    PreferencesChartsSpectrogramDescription -> "编辑频谱图的渲染设置。"
    PreferencesChartsSpectrogramEnabled -> "启用频谱图"
    PreferencesChartsSpectrogramHeight -> "相对于波形图的高度（%%）"
    PreferencesChartsSpectrogramPointDensity -> "点数/像素"
    PreferencesChartsSpectrogramPointDensityDescription -> "该数值与图像质量成反比。"
    PreferencesChartsSpectrogramHopSize -> "FFT 间隔"
    PreferencesChartsSpectrogramHopSizeDescription -> "该数值会根据音频文件的采样率自动调整。"
    PreferencesChartsSpectrogramWindowSize -> "窗长"
    PreferencesChartsSpectrogramWindowSizeDescription -> "该数值会根据音频文件的采样率自动调整。"
    PreferencesChartsSpectrogramMelScaleStep -> "频率分辨率（mel）"
    PreferencesChartsSpectrogramMaxFrequency -> "最大显示频率（Hz）"
    PreferencesChartsSpectrogramMinIntensity -> "最小显示强度（dB）"
    PreferencesChartsSpectrogramMinIntensityInvalid -> "最小显示强度必须小于最大显示强度。"
    PreferencesChartsSpectrogramMaxIntensity -> "最大显示强度（dB）"
    PreferencesChartsSpectrogramMaxIntensityInvalid -> "最大显示强度必须大于最小显示强度。"
    PreferencesChartsSpectrogramWindowType -> "窗函数"
    PreferencesChartsSpectrogramColorPalette -> "配色方案"
    PreferencesChartsSpectrogramColorPaletteDescription ->
        "频谱图的配色方案。您可以通过在@edit{这里}增加设定文件来添加自定义配色方案。您需要重新打开偏好设置对话框才能使更改生效。"
    PreferencesChartsSpectrogramUseHighAlphaContrast -> "提高透明度的对比度"
    PreferencesChartsSpectrogramUseHighAlphaContrastDescription -> "该选项只对使用了透明度的配色方案有效。"
    PreferencesChartsPower -> "功率图"
    PreferencesChartsPowerDescription -> "编辑功率图的渲染设置"
    PreferencesChartsPowerEnabled -> "启用功率图"
    PreferencesChartsPowerMergeChannels -> "合并通道"
    PreferencesChartsPowerHeight -> "相对于波形图的高度（%%）"
    PreferencesChartsPowerUnitSize -> "点数/像素"
    PreferencesChartsPowerUnitSizeDescription -> "该数值与图像质量成反比。"
    PreferencesChartsPowerUnitSizeInvalid -> "点数/像素必须小于等于窗长。"
    PreferencesChartsPowerWindowSize -> "窗长"
    PreferencesChartsPowerWindowSizeInvalid -> "窗长必须大于等于点数/像素。"
    PreferencesChartsPowerMinPower -> "最小显示功率（dB）"
    PreferencesChartsPowerMinPowerInvalid -> "最小显示功率必须小于最大显示功率。"
    PreferencesChartsPowerMaxPower -> "最大显示功率（dB）"
    PreferencesChartsPowerMaxPowerInvalid -> "最大显示功率必须大于最小显示功率。"
    PreferencesChartsPowerIntensityAccuracy -> "图像高度（像素）"
    PreferencesChartsPowerColor -> "前景色"
    PreferencesChartsPowerBackgroundColor -> "背景色"
    PreferencesChartsConversion -> "音频格式支持"
    PreferencesChartsConversionDescription -> "配置除 wav 以外的音频格式支持。"
    PreferencesChartsConversionFFmpegPath -> "FFmpeg 可执行文件路径"
    PreferencesChartsConversionFFmpegPathDescription ->
        "请安装 @open{FFmpeg} 并设置可执行文件路径，用以进行音频文件格式的转换。" +
            "您可能还需要确保它在您的操作系统中可以被执行。（可能出现的问题包括：未签名的可执行文件，访问权限不足等）。"
    PreferencesChartsConversionFFmpegArgs -> "FFmpeg 参数（除输入和输出）"
    PreferencesChartsConversionFFmpegUseForWav -> "使用 FFmpeg 转换 wav 文件"
    PreferencesKeymap -> "键位映射"
    PreferencesKeymapDescription -> "编辑键盘/鼠标操作的键位映射。"
    PreferencesKeymapKeyAction -> "键盘操作"
    PreferencesKeymapKeyActionDescription -> "编辑键盘操作的键位映射。"
    PreferencesKeymapMouseClickAction -> "鼠标点击操作"
    PreferencesKeymapMouseClickActionDescription ->
        "编辑鼠标点击操作的键位映射。\n" +
            "这些操作只有对应的键位组合全部被按下时才会被触发。"
    PreferencesKeymapMouseScrollAction -> "鼠标滚轮操作"
    PreferencesKeymapMouseScrollActionDescription ->
        "编辑鼠标滚轮操作的键位映射。\n" +
            "这些操作只有对应的键位组合全部被按下时才会被触发。"
    PreferencesKeymapEditDialogTitle -> "编辑键位映射："
    PreferencesKeymapEditDialogDescriptionMouseClick -> "通过在该输入框上左键/右键单击来输入对应键位。"
    PreferencesKeymapEditDialogDescriptionMouseScroll -> "通过在该输入框上滚动鼠标滚轮来输入对应键位。"
    PreferencesKeymapEditDialogConflictingLabel -> "该键位已被以下操作占用："
    PreferencesKeymapEditDialogConflictingWarning -> "该键位组合已被分配到其他操作。是否要移除其他分配？"
    PreferencesKeymapEditDialogConflictingWarningKeep -> "保持"
    PreferencesKeymapEditDialogConflictingWarningRemove -> "移除"
    PreferencesView -> "视图"
    PreferencesViewDescription -> "编辑视图的外观。"
    PreferencesViewLanguage -> "语言"
    PreferencesViewHideSampleExtension -> "隐藏采样文件扩展名"
    PreferencesViewAppAccentColor -> "应用程序主题色（亮色）"
    PreferencesViewAppAccentColorVariant -> "应用程序主题色（暗色）"
    PreferencesViewPinnedEntryListPosition -> "固定条目列表的位置"
    PreferencesViewPositionLeft -> "左侧"
    PreferencesViewPositionRight -> "右侧"
    PreferencesViewPositionTop -> "顶部"
    PreferencesViewPositionBottom -> "底部"
    PreferencesViewCornerPositionTopLeft -> "左上角"
    PreferencesViewCornerPositionTopRight -> "右上角"
    PreferencesViewCornerPositionBottomLeft -> "左下角"
    PreferencesViewCornerPositionBottomRight -> "右下角"
    PreferencesFontSizeSmall -> "小"
    PreferencesFontSizeMedium -> "中"
    PreferencesFontSizeLarge -> "大"
    PreferencesEditor -> "编辑器"
    PreferencesEditorDescription -> "编辑编辑器的外观与行为。"
    PreferencesEditorPlayerCursorColor -> "音频播放光标颜色"
    PreferencesEditorLockedDrag -> "锁定拖动"
    PreferencesEditorLockedDragDescription ->
        "选择启用锁定拖动的条件。" +
            "当锁定拖动有效，其他参数线将会跟随您拖动的参数线移动，以保持它们之间的相对位置。"
    PreferencesEditorLockedDragUseLabeler -> "使用标注器的设置"
    PreferencesEditorLockedDragUseStart -> "当拖动条目的起始线时"
    PreferencesEditorLockedDragNever -> "从不启用"
    PreferencesEditorLockedSettingParameterWithCursor -> "光标设定时也应用锁定拖动"
    PreferencesEditorLockedSettingParameterWithCursorDescription ->
        "使用\"将参数设置到光标位置\"键盘操作时也应用上面的锁定拖动的设置。"
    PreferencesEditorNotes -> "备注"
    PreferencesEditorNotesDescription -> "编辑与条目备注（星标，完成，标签）相关的外观与行为。 "
    PreferencesEditorShowDone -> "显示\"完成\"状态"
    PreferencesEditorShowStarred -> "显示\"星标\"状态"
    PreferencesEditorShowTag -> "显示标签"
    PreferencesEditorPostEditAction -> "编辑后的行为"
    PreferencesEditorPostEditActionDescription -> "编辑在编辑器中编辑条目后的行为。"
    PreferencesEditorPostEditActionDone -> "将编辑后的条目设为\"完成\""
    PreferencesEditorPostEditActionNext -> "编辑后跳转到下一个条目"
    PreferencesEditorPostEditActionEnabled -> "启用"
    PreferencesEditorPostEditActionTrigger -> "触发该行为的参数"
    PreferencesEditorPostEditActionTriggerUseLabeler -> "使用标注器的设置"
    PreferencesEditorPostEditActionTriggerUseStart -> "条目的起始线"
    PreferencesEditorPostEditActionTriggerUseEnd -> "条目的结束线"
    PreferencesEditorPostEditActionTriggerUseAny -> "任意参数"
    PreferencesEditorPostEditActionUseDragging -> "拖动时触发"
    PreferencesEditorPostEditActionUseDraggingDescription -> "在通过拖动参数线来编辑条目后，触发该行为。"
    PreferencesEditorPostEditActionUseCursorSet -> "设置参数到光标位置时触发"
    PreferencesEditorPostEditActionUseCursorSetDescription -> "在通过\"将参数设置到光标位置\"键盘操作来编辑条目后，触发该行为。"
    PreferencesEditorScissors -> "剪刀"
    PreferencesEditorScissorsDescription -> "编辑剪刀工具的外观与行为。"
    PreferencesEditorScissorsColor -> "颜色"
    PreferencesEditorScissorsActionTargetNone -> "无"
    PreferencesEditorScissorsActionTargetFormer -> "前一个条目"
    PreferencesEditorScissorsActionTargetLatter -> "后一个条目"
    PreferencesEditorScissorsActionGoTo -> "切割后跳转至"
    PreferencesEditorScissorsActionAskForName -> "切割后重命名"
    PreferencesEditorScissorsActionPlay -> "切割时播放"
    PreferencesEditorAutoScroll -> "自动滚动"
    PreferencesEditorAutoScrollDescription -> "设置执行自动滚动的条件。"
    PreferencesEditorAutoScrollOnLoadedNewSample -> "切换采样时"
    PreferencesEditorAutoScrollOnJumpedToEntry -> "按绝对索义跳转至条目时"
    PreferencesEditorAutoScrollOnSwitchedInMultipleEditMode -> "在多重编辑模式下切换条目时"
    PreferencesEditorAutoScrollOnSwitched -> "切换条目时"
    PreferencesEditorContinuousLabelNames -> "标签名（连续）"
    PreferencesEditorContinuousLabelNamesDescription -> "编辑在使用连续的标注器时，显示在编辑器中的标签名的外观。"
    PreferencesEditorContinuousLabelNamesColor -> "颜色"
    PreferencesEditorContinuousLabelNamesSize -> "大小"
    PreferencesEditorContinuousLabelNamesPosition -> "位置"
    PreferencesPlayback -> "播放"
    PreferencesPlaybackDescription -> "编辑音频播放的行为。"
    PreferencesPlaybackPlayOnDragging -> "预览播放"
    PreferencesPlaybackPlayOnDraggingDescription -> "当使用预览播放的键位（参见键位映射）拖动参数线时，播放光标附近处的音频短片段。"
    PreferencesPlaybackPlayOnDraggingEnabled -> "启用"
    PreferencesPlaybackPlayOnDraggingRangeRadiusMillis -> "半径（毫秒）"
    PreferencesPlaybackPlayOnDraggingEventQueueSize -> "保留拖动事件的个数"
    PreferencesAutoSave -> "自动保存"
    PreferencesAutoSaveDescription -> "编辑自动保存项目的行为。"
    PreferencesAutoSaveTarget -> "自动保存到"
    PreferencesAutoSaveTargetNone -> "不自动保存"
    PreferencesAutoSaveTargetProject -> "覆盖项目文件"
    PreferencesAutoSaveTargetRecord -> "临时文件"
    PreferencesAutoSaveIntervalSec -> "间隔（秒）"
    PreferencesHistory -> "编辑历史"
    PreferencesHistoryDescription -> "编辑有关编辑历史（撤销/重做）的行为。"
    PreferencesHistoryMaxSize -> "最大保存的编辑次数"
    PreferencesHistorySquashIndex -> "压缩索引变更"
    PreferencesHistorySquashIndexDescription ->
        "当启用该项时，仅包含索引变更的操作（如切换条目），直到下一次包含内容变更的操作前，" +
            "将不会被保存在历史中。"
    PreferencesMisc -> "其他"
    PreferencesMiscDescription -> "编辑其他设置。请注意，这些设置可能包含一些实验性的功能。"
    PreferencesMiscUseCustomFileDialog -> "使用自定义的文件对话框来代替系统文件对话框"
    PreferencesMiscUseCustomFileDialogDescription ->
        "启用后，文件对话框将会被自定义的对话框所代替。" +
            "这可能会在您使用不支持系统文件对话框的桌面环境时有所帮助。您可能需要重启应用才能使该设置生效。"
    ActionToggleSamplePlayback -> "播放/暂停当前采样"
    ActionToggleEntryPlayback -> "播放/暂停当前条目"
    ActionToggleScreenRangePlayback -> "播放/暂停当前屏幕范围"
    ActionToggleVideoPopupEmbedded -> "显示/关闭内嵌式视频"
    ActionToggleVideoPopupNewWindow -> "显示/关闭新窗口视频"
    ActionIncreaseResolution -> "缩小"
    ActionDecreaseResolution -> "放大"
    ActionInputResolution -> "输入画布分辨率"
    ActionCancelDialog -> "关闭对话框"
    ActionScissorsCut -> "在当前光标位置切割"
    ActionSetValue1 -> "将参数1设置到光标位置"
    ActionSetValue2 -> "将参数2设置到光标位置"
    ActionSetValue3 -> "将参数3设置到光标位置"
    ActionSetValue4 -> "将参数4设置到光标位置"
    ActionSetValue5 -> "将参数5设置到光标位置"
    ActionSetValue6 -> "将参数6设置到光标位置"
    ActionSetValue7 -> "将参数7设置到光标位置"
    ActionSetValue8 -> "将参数8设置到光标位置"
    ActionSetValue9 -> "将参数9设置到光标位置"
    ActionSetValue10 -> "将参数10设置到光标位置"
    ActionSetProperty1 -> "输入属性1的值"
    ActionSetProperty2 -> "输入属性2的值"
    ActionSetProperty3 -> "输入属性3的值"
    ActionSetProperty4 -> "输入属性4的值"
    ActionSetProperty5 -> "输入属性5的值"
    ActionSetProperty6 -> "输入属性6的值"
    ActionSetProperty7 -> "输入属性7的值"
    ActionSetProperty8 -> "输入属性8的值"
    ActionSetProperty9 -> "输入属性9的值"
    ActionSetProperty10 -> "输入属性10的值"
    ActionQuickLaunch1 -> "启动插件槽位1"
    ActionQuickLaunch2 -> "启动插件槽位2"
    ActionQuickLaunch3 -> "启动插件槽位3"
    ActionQuickLaunch4 -> "启动插件槽位4"
    ActionQuickLaunch5 -> "启动插件槽位5"
    ActionQuickLaunch6 -> "启动插件槽位6"
    ActionQuickLaunch7 -> "启动插件槽位7"
    ActionQuickLaunch8 -> "启动插件槽位8"
    ActionMoveParameter -> "拖动参数线"
    ActionMoveParameterWithPlaybackPreview -> "拖动参数线并执行预览播放"
    ActionMoveParameterIgnoringConstraints -> "拖动参数线（忽略约束）"
    ActionMoveParameterInvertingLocked -> "拖动参数线（反转锁定拖动）"
    ActionPlayAudioSection -> "播放点击位置的音频片段"
    ActionPlayAudioUntilEnd -> "播放点击位置到结尾的音频"
    ActionPlayAudioUntilScreenEnd -> "播放点击位置到屏幕右端位置的音频"
    ActionPlayAudioFromStart -> "播放直到点击位置的音频"
    ActionPlayAudioFromScreenStart -> "播放屏幕左端位置到点击位置的音频"
    ActionPlayAudioRange -> "播放拖动范围内的音频"
    ActionPlayAudioRangeRepeat -> "循环播放拖动范围内的音频"
    ActionScrollCanvasLeft -> "向左滚动画布"
    ActionScrollCanvasRight -> "向右滚动画布"
    ActionZoomInCanvas -> "放大"
    ActionZoomOutCanvas -> "缩小"
    ActionGoToNextEntry -> "下一个条目"
    ActionGoToPreviousEntry -> "上一个条目"
    ActionGoToNextSample -> "下一个采样"
    ActionGoToPreviousSample -> "上一个采样"
    CheckForUpdatesAlreadyUpdated -> "已更新到最新版本。"
    CheckForUpdatesFailure -> "检查更新失败。"
    UpdaterDialogSummaryDetailsLink -> "查看详细信息"
    UpdaterDialogTitle -> "vLabeler - 检查更新"
    UpdaterDialogCurrentVersionLabel -> "当前版本：%s"
    UpdaterDialogLatestVersionLabel -> "最新版本：%s (%s)"
    UpdaterDialogStartDownloadButton -> "下载"
    UpdaterDialogIgnoreButton -> "忽略该版本"
    UpdaterDialogDownloadPositionLabel -> "保存位置："
    UpdaterDialogChangeDownloadPositionButton -> "更改"
    UpdaterDialogChooseDownloadPositionDialogTitle -> "选择保存位置"
    AboutDialogTitle -> "vLabeler - 关于"
    AboutDialogCopyInfo -> "复制信息"
    AboutDialogShowLicenses -> "显示许可"
    LicenseDialogTitle -> "vLabeler - 许可"
    LicenseDialogLicenses -> "vLabeler 使用到的开源许可"
    LoadProjectWarningLabelerCreated -> "从项目文件中安装了新的标注器 `%s`。"
    LoadProjectWarningLabelerUpdated -> "从项目文件中安装了标注器 `%1\$s` 的版本更新 `%2\$s`。"
    LoadProjectWarningCacheDirReset -> "无法找到/创建项目文件所定义的缓存目录。将使用默认的缓存目录。"
    FilterStarred -> "仅显示星标"
    FilterUnstarred -> "仅显示未星标"
    FilterStarIgnored -> "不筛选星标状态"
    FilterDone -> "仅显示已完成"
    FilterUndone -> "仅显示未完成"
    FilterDoneIgnored -> "不筛选完成状态"
    FilterLink -> "将筛选器应用到项目导航"
    FilterLinked -> "筛选器已应用到项目导航"
    ColorPickerDialogTitle -> "vLabeler - 选色器"
    QuickLaunchManagerDialogTitle -> "插件槽位"
    QuickLaunchManagerDialogDescription ->
        "您可以将常用的批量编辑插件连同其参数一起设置到插件槽位中，以便快速调用。插件槽位中存放的参数各自独立，也不影响通常使用时保存的参数。"
    QuickLaunchManagerDialogHeaderTitle -> "槽位"
    QuickLaunchManagerDialogHeaderPlugin -> "插件"
    QuickLaunchManagerDialogHeaderForceAskParams -> "总是询问参数"
    QuickLaunchManagerDialogItemTitle -> "槽位 %d"
    QuickLaunchManagerDialogOpenKeymap -> "打开键位映射"
    TrackingSettingsDialogTitle -> "统计使用数据"
    TrackingSettingsDialogDescription ->
        "您可以在这里启用/禁用使用数据统计。它会收集匿名的使用事件，例如 `启动应用` 和 `使用插件`。" +
            "收集的数据将用于改进 vLabeler。这些数据不包含任何关于您的项目、数据或个人信息的具体信息。" +
            "如果您觉得这是可以接受的，请启用统计，我们将十分感谢。另外，您可以点击 `详细信息` 按钮查看更多详情。"
    TrackingSettingsDialogFirstTimeAlert ->
        "由于您首次启动了包含使用数据统计功能的 vLabeler，本对话框已自动被打开。" +
            "您可以在菜单 `设置` -> `统计使用数据...` 中随时再次打开本对话框，进行设置的修改。"
    TrackingSettingsDialogEnabled -> "启用"
    TrackingSettingsDialogTrackingIdLabel -> "Tracking ID："
    ProjectSettingDialogTitle -> "项目设置"
    ProjectSettingOutputFileLabel -> "输出文件"
    ProjectSettingOutputFileHelperText -> "工程导出的对象路径。如果该项未设置，`覆盖导出`将被禁用。"
    ProjectSettingOutputFileDisabledPlaceholder -> "当前使用的标注器禁止更改该项。"
    ProjectSettingOutputFileSelectorDialogTitle -> "选择输出文件"
    ProjectSettingAutoExportHelperText ->
        "保存时，自动将项目中所有的子项目覆盖导出到对应的输出文件。\n" +
            "此项仅在本设置中的`输出文件`被正确设置，或者已被标注器固定时才有效。"
    ImportEntriesDialogTitle -> "导入项目"
    ImportEntriesDialogItemSummaryTitle -> "%d 个条目"
    ImportEntriesDialogItemTargetLabel -> "导入到"
    ImportEntriesDialogItemIncompatible -> "与当前项目不兼容"
    ImportEntriesDialogReplaceContent -> "替换现有内容"
    ImportEntriesDialogReplaceContentDisabledDescription -> "当前项目不支持追加条目，因此所有现有条目将被导入的条目替换。"
    EntrySampleSyncerModuleText -> "处理子项目 %d/%d..."
    EntrySampleSyncerModuleTextFinished -> "处理子项目 %d/%d... 完成"
    EntrySampleSyncerSampleText -> "处理采样文件 %d/%d..."
    EntrySampleSyncerSampleTextFinished -> "处理采样文件 %d/%d... 完成"
    FFmpegConverterException ->
        "读取采样文件失败。如果您需要读取 wav 以外的音频格式，" +
            "请安装 FFmpeg 并在 `偏好设置` -> `图表` -> `音频格式支持` 中配置程序路径。" +
            "如果您已经安装并配置了 FFmpeg，请检查日志以获取更多详细信息。"
    else -> null
}
