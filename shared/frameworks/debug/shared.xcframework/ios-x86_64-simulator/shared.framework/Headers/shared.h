#import <Foundation/NSArray.h>
#import <Foundation/NSDictionary.h>
#import <Foundation/NSError.h>
#import <Foundation/NSObject.h>
#import <Foundation/NSSet.h>
#import <Foundation/NSString.h>
#import <Foundation/NSValue.h>

@class SharedViewmodelSKComponentCompanion, SharedKotlinx_coroutines_coreCoroutineStart, SharedKotlinException, SharedKotlinThrowable, SharedCorePoker, SharedViewmodelSKComponent<__covariant V>, SharedViewmodelSKLoader, SharedViewmodelSKScreen<V>, SharedViewmodelSKStack, SharedViewmodelSKBottomSheet, SharedOnTopGen, SharedViewmodelSKButton, SharedSplashGen, SharedViewcontractSKUri, SharedKotlinUnit, SharedViewcontractSKFeatureInitializer, SharedViewcontractStyle, SharedKotlinCancellationException, SharedKotlinEnumCompanion, SharedKotlinEnum<E>, SharedKotlinArray<T>, SharedModelcontractDatedData<D>, SharedViewmodelSKStackState, SharedKotlinRuntimeException, SharedKotlinIllegalStateException, SharedViewcontractSKComboVCChoice, SharedViewcontractIcon, SharedViewcontractSKInputVCType, SharedViewcontractSKWebViewVCConfig, SharedViewcontractSKWebViewVCOpenUrl, SharedViewcontractSKStackVCState, SharedViewcontractSKBottomSheetVCShown, SharedViewcontractSKAlertVCShown, SharedViewcontractSKListVCItem, SharedViewcontractSKSnackBarVCShown, SharedViewcontractSKWebViewVCBackRequest, SharedViewcontractSKWebViewVCRedirectParam, SharedViewcontractSKWindowPopupVCShown, SharedKotlinx_coroutines_coreAtomicDesc, SharedKotlinx_coroutines_coreLockFreeLinkedListNodePrepareOp, SharedViewcontractSKAlertVCButton, SharedViewcontractSKSnackBarVCAction, SharedViewcontractSKWindowPopupVCBehavior, SharedKotlinx_coroutines_coreAtomicOp<__contravariant T>, SharedKotlinx_coroutines_coreOpDescriptor, SharedKotlinx_coroutines_coreLockFreeLinkedListNode, SharedKotlinx_coroutines_coreLockFreeLinkedListNodeAbstractAtomicDesc, SharedKotlinx_coroutines_coreLockFreeLinkedListNodeAddLastDesc<T>, SharedKotlinx_coroutines_coreLockFreeLinkedListNodeRemoveFirstDesc<T>;

@protocol SharedKotlinCoroutineContext, SharedKotlinx_coroutines_coreCoroutineScope, SharedKotlinx_coroutines_coreJob, SharedKotlinSuspendFunction1, SharedModelcontractSKData, SharedKotlinx_coroutines_coreCompletableJob, SharedViewcontractSKVisiblityListener, SharedViewcontractSKTransition, SharedViewcontractSKScreenVC, SharedViewcontractSKComponentVC, SharedOnTopVC, SharedSplashVC, SharedKotlinSuspendFunction0, SharedViewcontractSKButtonVC, SharedColors, SharedIcons, SharedModelcontractModelInjector, SharedModelcontractPlurals, SharedModelcontractStrings, SharedStyles, SharedTransitions, SharedViewInjector, SharedViewcontractCoreViewInjector, SharedKotlinCoroutineContextElement, SharedKotlinCoroutineContextKey, SharedKotlinx_coroutines_coreChildHandle, SharedKotlinx_coroutines_coreChildJob, SharedKotlinx_coroutines_coreDisposableHandle, SharedKotlinSequence, SharedKotlinx_coroutines_coreSelectClause0, SharedKotlinComparable, SharedKotlinFunction, SharedKotlinx_coroutines_coreFlow, SharedViewcontractSKLoaderVC, SharedViewcontractSKStackVC, SharedViewcontractSKBottomSheetVC, SharedViewcontractSKAlertVC, SharedViewcontractSKComboVC, SharedViewcontractSKFrameVC, SharedViewcontractSKImageButtonVC, SharedViewcontractSKInputVC, SharedViewcontractSKSimpleInputVC, SharedViewcontractSKInputWithSuggestionsVC, SharedViewcontractSKPagerVC, SharedViewcontractSKPagerWithTabsVC, SharedViewcontractSKBoxVC, SharedViewcontractSKListVC, SharedViewcontractSKSnackBarVC, SharedViewcontractSKWebViewVC, SharedViewcontractSKWindowPopupVC, SharedKotlinx_coroutines_coreParentJob, SharedKotlinIterator, SharedKotlinx_coroutines_coreSelectInstance, SharedKotlinx_coroutines_coreFlowCollector, SharedKotlinContinuation;

NS_ASSUME_NONNULL_BEGIN
#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wunknown-warning-option"
#pragma clang diagnostic ignored "-Wincompatible-property-type"
#pragma clang diagnostic ignored "-Wnullability"

#pragma push_macro("_Nullable_result")
#if !__has_feature(nullability_nullable_result)
#undef _Nullable_result
#define _Nullable_result _Nullable
#endif

__attribute__((swift_name("KotlinBase")))
@interface SharedBase : NSObject
- (instancetype)init __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
+ (void)initialize __attribute__((objc_requires_super));
@end;

@interface SharedBase (SharedBaseCopying) <NSCopying>
@end;

__attribute__((swift_name("KotlinMutableSet")))
@interface SharedMutableSet<ObjectType> : NSMutableSet<ObjectType>
@end;

__attribute__((swift_name("KotlinMutableDictionary")))
@interface SharedMutableDictionary<KeyType, ObjectType> : NSMutableDictionary<KeyType, ObjectType>
@end;

@interface NSError (NSErrorSharedKotlinException)
@property (readonly) id _Nullable kotlinException;
@end;

__attribute__((swift_name("KotlinNumber")))
@interface SharedNumber : NSNumber
- (instancetype)initWithChar:(char)value __attribute__((unavailable));
- (instancetype)initWithUnsignedChar:(unsigned char)value __attribute__((unavailable));
- (instancetype)initWithShort:(short)value __attribute__((unavailable));
- (instancetype)initWithUnsignedShort:(unsigned short)value __attribute__((unavailable));
- (instancetype)initWithInt:(int)value __attribute__((unavailable));
- (instancetype)initWithUnsignedInt:(unsigned int)value __attribute__((unavailable));
- (instancetype)initWithLong:(long)value __attribute__((unavailable));
- (instancetype)initWithUnsignedLong:(unsigned long)value __attribute__((unavailable));
- (instancetype)initWithLongLong:(long long)value __attribute__((unavailable));
- (instancetype)initWithUnsignedLongLong:(unsigned long long)value __attribute__((unavailable));
- (instancetype)initWithFloat:(float)value __attribute__((unavailable));
- (instancetype)initWithDouble:(double)value __attribute__((unavailable));
- (instancetype)initWithBool:(BOOL)value __attribute__((unavailable));
- (instancetype)initWithInteger:(NSInteger)value __attribute__((unavailable));
- (instancetype)initWithUnsignedInteger:(NSUInteger)value __attribute__((unavailable));
+ (instancetype)numberWithChar:(char)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedChar:(unsigned char)value __attribute__((unavailable));
+ (instancetype)numberWithShort:(short)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedShort:(unsigned short)value __attribute__((unavailable));
+ (instancetype)numberWithInt:(int)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedInt:(unsigned int)value __attribute__((unavailable));
+ (instancetype)numberWithLong:(long)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedLong:(unsigned long)value __attribute__((unavailable));
+ (instancetype)numberWithLongLong:(long long)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedLongLong:(unsigned long long)value __attribute__((unavailable));
+ (instancetype)numberWithFloat:(float)value __attribute__((unavailable));
+ (instancetype)numberWithDouble:(double)value __attribute__((unavailable));
+ (instancetype)numberWithBool:(BOOL)value __attribute__((unavailable));
+ (instancetype)numberWithInteger:(NSInteger)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedInteger:(NSUInteger)value __attribute__((unavailable));
@end;

__attribute__((swift_name("KotlinByte")))
@interface SharedByte : SharedNumber
- (instancetype)initWithChar:(char)value;
+ (instancetype)numberWithChar:(char)value;
@end;

__attribute__((swift_name("KotlinUByte")))
@interface SharedUByte : SharedNumber
- (instancetype)initWithUnsignedChar:(unsigned char)value;
+ (instancetype)numberWithUnsignedChar:(unsigned char)value;
@end;

__attribute__((swift_name("KotlinShort")))
@interface SharedShort : SharedNumber
- (instancetype)initWithShort:(short)value;
+ (instancetype)numberWithShort:(short)value;
@end;

__attribute__((swift_name("KotlinUShort")))
@interface SharedUShort : SharedNumber
- (instancetype)initWithUnsignedShort:(unsigned short)value;
+ (instancetype)numberWithUnsignedShort:(unsigned short)value;
@end;

__attribute__((swift_name("KotlinInt")))
@interface SharedInt : SharedNumber
- (instancetype)initWithInt:(int)value;
+ (instancetype)numberWithInt:(int)value;
@end;

__attribute__((swift_name("KotlinUInt")))
@interface SharedUInt : SharedNumber
- (instancetype)initWithUnsignedInt:(unsigned int)value;
+ (instancetype)numberWithUnsignedInt:(unsigned int)value;
@end;

__attribute__((swift_name("KotlinLong")))
@interface SharedLong : SharedNumber
- (instancetype)initWithLongLong:(long long)value;
+ (instancetype)numberWithLongLong:(long long)value;
@end;

__attribute__((swift_name("KotlinULong")))
@interface SharedULong : SharedNumber
- (instancetype)initWithUnsignedLongLong:(unsigned long long)value;
+ (instancetype)numberWithUnsignedLongLong:(unsigned long long)value;
@end;

__attribute__((swift_name("KotlinFloat")))
@interface SharedFloat : SharedNumber
- (instancetype)initWithFloat:(float)value;
+ (instancetype)numberWithFloat:(float)value;
@end;

__attribute__((swift_name("KotlinDouble")))
@interface SharedDouble : SharedNumber
- (instancetype)initWithDouble:(double)value;
+ (instancetype)numberWithDouble:(double)value;
@end;

__attribute__((swift_name("KotlinBoolean")))
@interface SharedBoolean : SharedNumber
- (instancetype)initWithBool:(BOOL)value;
+ (instancetype)numberWithBool:(BOOL)value;
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreCoroutineScope")))
@protocol SharedKotlinx_coroutines_coreCoroutineScope
@required
@property (readonly) id<SharedKotlinCoroutineContext> coroutineContext __attribute__((swift_name("coroutineContext")));
@end;

__attribute__((swift_name("ViewmodelSKComponent")))
@interface SharedViewmodelSKComponent<__covariant V> : SharedBase <SharedKotlinx_coroutines_coreCoroutineScope>
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
@property (class, readonly, getter=companion) SharedViewmodelSKComponentCompanion *companion __attribute__((swift_name("companion")));
- (id)computeItemId __attribute__((swift_name("computeItemId()")));
- (id<SharedKotlinx_coroutines_coreJob>)launchNoCrashStart:(SharedKotlinx_coroutines_coreCoroutineStart *)start block:(id<SharedKotlinSuspendFunction1>)block __attribute__((swift_name("launchNoCrash(start:block:)")));
- (id<SharedKotlinx_coroutines_coreJob>)launchWithLoaderAndErrorsContext:(id<SharedKotlinCoroutineContext>)context start:(SharedKotlinx_coroutines_coreCoroutineStart *)start errorMessage:(NSString * _Nullable)errorMessage block:(id<SharedKotlinSuspendFunction1>)block __attribute__((swift_name("launchWithLoaderAndErrors(context:start:errorMessage:block:)")));
- (id<SharedKotlinx_coroutines_coreJob>)launchWithOptionsContext:(id<SharedKotlinCoroutineContext>)context start:(SharedKotlinx_coroutines_coreCoroutineStart *)start withLoader:(BOOL)withLoader specificErrorTreatment:(void (^ _Nullable)(SharedKotlinException *))specificErrorTreatment errorMessage:(NSString * _Nullable)errorMessage block:(id<SharedKotlinSuspendFunction1>)block __attribute__((swift_name("launchWithOptions(context:start:withLoader:specificErrorTreatment:errorMessage:block:)")));
- (void)logDMessage:(id _Nullable)message __attribute__((swift_name("logD(message:)")));
- (void)logEThrowable:(SharedKotlinThrowable *)throwable message:(id _Nullable)message __attribute__((swift_name("logE(throwable:message:)")));
- (void)observePoker:(SharedCorePoker *)poker onPoke:(void (^)(void))onPoke __attribute__((swift_name("observe(poker:onPoke:)")));
- (void)onRemove __attribute__((swift_name("onRemove()")));
- (NSArray<SharedViewmodelSKComponent<id> *> *)plusOtherComponents:(NSArray<SharedViewmodelSKComponent<id> *> * _Nullable)otherComponents __attribute__((swift_name("plus(otherComponents:)")));
- (NSArray<SharedViewmodelSKComponent<id> *> *)plusOtherComponent:(SharedViewmodelSKComponent<id> * _Nullable)otherComponent __attribute__((swift_name("plus(otherComponent:)")));
- (void)treatErrorException:(SharedKotlinException *)exception errorMessage:(NSString * _Nullable)errorMessage __attribute__((swift_name("treatError(exception:errorMessage:)")));
- (void)onChange:(id<SharedModelcontractSKData>)receiver lambda:(void (^)(id _Nullable))lambda __attribute__((swift_name("onChange(_:lambda:)")));
- (void)onData:(id<SharedModelcontractSKData>)receiver validity:(SharedLong * _Nullable)validity withLoaderForFirstData:(BOOL)withLoaderForFirstData fallBackDataBeforeFirstDataLoaded:(BOOL)fallBackDataBeforeFirstDataLoaded fallBackDataIfError:(BOOL)fallBackDataIfError treatErrors:(BOOL)treatErrors defaultErrorMessage:(NSString * _Nullable)defaultErrorMessage block:(void (^)(id _Nullable))block __attribute__((swift_name("onData(_:validity:withLoaderForFirstData:fallBackDataBeforeFirstDataLoaded:fallBackDataIfError:treatErrors:defaultErrorMessage:block:)")));
@property (readonly) id<SharedKotlinCoroutineContext> coroutineContext __attribute__((swift_name("coroutineContext")));
@property (readonly) id<SharedKotlinx_coroutines_coreCompletableJob> job __attribute__((swift_name("job")));
@property (readonly) SharedViewmodelSKLoader * _Nullable loader __attribute__((swift_name("loader")));
@property (readonly) void (^ _Nullable onSwipe)(void) __attribute__((swift_name("onSwipe")));
@property (readonly) V view __attribute__((swift_name("view")));
@end;

__attribute__((swift_name("ViewcontractSKVisiblityListener")))
@protocol SharedViewcontractSKVisiblityListener
@required
- (void)onPause __attribute__((swift_name("onPause()")));
- (void)onResume __attribute__((swift_name("onResume()")));
@end;

__attribute__((swift_name("ViewmodelSKScreen")))
@interface SharedViewmodelSKScreen<V> : SharedViewmodelSKComponent<id<SharedViewcontractSKScreenVC>> <SharedViewcontractSKVisiblityListener>
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (void)dismiss __attribute__((swift_name("dismiss()")));
- (void)dismissIfBottomSheet __attribute__((swift_name("dismissIfBottomSheet()")));
- (void)finishTransition:(id<SharedViewcontractSKTransition> _Nullable)transition __attribute__((swift_name("finish(transition:)")));
- (void)finishIfInAStack __attribute__((swift_name("finishIfInAStack()")));
- (void)onPause __attribute__((swift_name("onPause()")));
- (void)onResume __attribute__((swift_name("onResume()")));
- (void)pushScreen:(SharedViewmodelSKScreen<id> *)screen __attribute__((swift_name("push(screen:)")));
- (void)removeAllScreensOnTop __attribute__((swift_name("removeAllScreensOnTop()")));
- (void)replaceWithScreen:(SharedViewmodelSKScreen<id> *)screen __attribute__((swift_name("replaceWith(screen:)")));
@property SharedViewmodelSKStack * _Nullable parent __attribute__((swift_name("parent")));
@property SharedViewmodelSKBottomSheet * _Nullable presenter __attribute__((swift_name("presenter")));
@end;

__attribute__((swift_name("OnTopGen")))
@interface SharedOnTopGen : SharedViewmodelSKScreen<id<SharedOnTopVC>>
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (void)onRemove __attribute__((swift_name("onRemove()")));
@property (readonly) SharedViewmodelSKComponent<id<SharedViewcontractSKComponentVC>> *btnClose __attribute__((swift_name("btnClose")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("OnTop")))
@interface SharedOnTop : SharedOnTopGen
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
@property (readonly) SharedViewmodelSKButton *btnClose __attribute__((swift_name("btnClose")));
@property (readonly) id<SharedOnTopVC> view __attribute__((swift_name("view")));
@end;

__attribute__((swift_name("SplashGen")))
@interface SharedSplashGen : SharedViewmodelSKScreen<id<SharedSplashVC>>
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (void)onRemove __attribute__((swift_name("onRemove()")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Splash")))
@interface SharedSplash : SharedSplashGen
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
@property (readonly) id<SharedSplashVC> view __attribute__((swift_name("view")));
@end;

__attribute__((swift_name("Colors")))
@protocol SharedColors
@required
@end;

__attribute__((swift_name("ViewcontractSKFeatureInitializer")))
@interface SharedViewcontractSKFeatureInitializer : SharedBase
- (instancetype)initWithInitialize:(id<SharedKotlinSuspendFunction0>)initialize onDeepLink:(void (^ _Nullable)(SharedViewcontractSKUri *))onDeepLink start:(id<SharedKotlinSuspendFunction0>)start __attribute__((swift_name("init(initialize:onDeepLink:start:)"))) __attribute__((objc_designated_initializer));

/**
 @note This method converts instances of CancellationException to errors.
 Other uncaught Kotlin exceptions are fatal.
*/
- (void)initializeIfNeededUri:(SharedViewcontractSKUri * _Nullable)uri completionHandler:(void (^)(SharedKotlinUnit * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("initializeIfNeeded(uri:completionHandler:)")));
@property (readonly) id<SharedKotlinSuspendFunction0> initialize __attribute__((swift_name("initialize")));
@property (readonly) void (^ _Nullable onDeepLink)(SharedViewcontractSKUri *) __attribute__((swift_name("onDeepLink")));
@property (readonly) id<SharedKotlinSuspendFunction0> start __attribute__((swift_name("start")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("DemoiosInitializer")))
@interface SharedDemoiosInitializer : SharedViewcontractSKFeatureInitializer
- (instancetype)initWithInitialize:(id<SharedKotlinSuspendFunction0>)initialize onDeepLink:(void (^)(SharedViewcontractSKUri *))onDeepLink start:(id<SharedKotlinSuspendFunction0>)start __attribute__((swift_name("init(initialize:onDeepLink:start:)"))) __attribute__((objc_designated_initializer));
@end;

__attribute__((swift_name("Icons")))
@protocol SharedIcons
@required
@end;

__attribute__((swift_name("Styles")))
@protocol SharedStyles
@required
@end;

__attribute__((swift_name("ViewcontractSKComponentVC")))
@protocol SharedViewcontractSKComponentVC
@required
- (void)closeKeyboard __attribute__((swift_name("closeKeyboard()")));
- (void)displayErrorMessageMessage:(NSString *)message __attribute__((swift_name("displayErrorMessage(message:)")));
- (void)onRemove __attribute__((swift_name("onRemove()")));
@property SharedViewcontractStyle * _Nullable style __attribute__((swift_name("style")));
@end;

__attribute__((swift_name("ViewcontractSKScreenVC")))
@protocol SharedViewcontractSKScreenVC <SharedViewcontractSKComponentVC>
@required
@property void (^ _Nullable onBackPressed)(void) __attribute__((swift_name("onBackPressed")));
@end;

__attribute__((swift_name("OnTopVC")))
@protocol SharedOnTopVC <SharedViewcontractSKScreenVC>
@required
@property (readonly) id<SharedViewcontractSKButtonVC> btnClose __attribute__((swift_name("btnClose")));
@end;

__attribute__((swift_name("SplashVC")))
@protocol SharedSplashVC <SharedViewcontractSKScreenVC>
@required
@property NSString *message __attribute__((swift_name("message")));
@property (readonly) void (^onTapOpenOnTopScreen)(void) __attribute__((swift_name("onTapOpenOnTopScreen")));
@end;

__attribute__((swift_name("Transitions")))
@protocol SharedTransitions
@required
@end;

__attribute__((swift_name("ViewInjector")))
@protocol SharedViewInjector
@required
- (id<SharedOnTopVC>)onTopVisibilityListener:(id<SharedViewcontractSKVisiblityListener>)visibilityListener btnClose:(id<SharedViewcontractSKButtonVC>)btnClose __attribute__((swift_name("onTop(visibilityListener:btnClose:)")));
- (id<SharedSplashVC>)splashVisibilityListener:(id<SharedViewcontractSKVisiblityListener>)visibilityListener onTapOpenOnTopScreen:(void (^)(void))onTapOpenOnTopScreen messageInitial:(NSString *)messageInitial __attribute__((swift_name("splash(visibilityListener:onTapOpenOnTopScreen:messageInitial:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StartKt")))
@interface SharedStartKt : SharedBase
+ (void)onDeeplinkUri:(SharedViewcontractSKUri *)uri __attribute__((swift_name("onDeeplink(uri:)")));
+ (void)startAny:(id)any __attribute__((swift_name("start(any:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ShortCutsKt")))
@interface SharedShortCutsKt : SharedBase
@property (class, readonly) id<SharedColors> colors __attribute__((swift_name("colors")));
@property (class, readonly) id<SharedIcons> icons __attribute__((swift_name("icons")));
@property (class, readonly) id<SharedModelcontractModelInjector> modelInjector __attribute__((swift_name("modelInjector")));
@property (class, readonly) id<SharedModelcontractPlurals> plurals __attribute__((swift_name("plurals")));
@property (class, readonly) id<SharedModelcontractStrings> strings __attribute__((swift_name("strings")));
@property (class, readonly) id<SharedStyles> styles __attribute__((swift_name("styles")));
@property (class, readonly) id<SharedTransitions> transitions __attribute__((swift_name("transitions")));
@property (class, readonly) id<SharedViewInjector> viewInjector __attribute__((swift_name("viewInjector")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StarterIosKt")))
@interface SharedStarterIosKt : SharedBase
+ (void)doInitInjectorViewInjector:(id<SharedViewInjector>)viewInjector coreViewInjector:(id<SharedViewcontractCoreViewInjector>)coreViewInjector __attribute__((swift_name("doInitInjector(viewInjector:coreViewInjector:)")));
+ (SharedViewmodelSKStack *)startIos __attribute__((swift_name("startIos()")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("TestKMMKt")))
@interface SharedTestKMMKt : SharedBase
+ (NSString *)coco __attribute__((swift_name("coco()")));
@end;

__attribute__((swift_name("KotlinCoroutineContext")))
@protocol SharedKotlinCoroutineContext
@required
- (id _Nullable)foldInitial:(id _Nullable)initial operation:(id _Nullable (^)(id _Nullable, id<SharedKotlinCoroutineContextElement>))operation __attribute__((swift_name("fold(initial:operation:)")));
- (id<SharedKotlinCoroutineContextElement> _Nullable)getKey:(id<SharedKotlinCoroutineContextKey>)key __attribute__((swift_name("get(key:)")));
- (id<SharedKotlinCoroutineContext>)minusKeyKey:(id<SharedKotlinCoroutineContextKey>)key __attribute__((swift_name("minusKey(key:)")));
- (id<SharedKotlinCoroutineContext>)plusContext:(id<SharedKotlinCoroutineContext>)context __attribute__((swift_name("plus(context:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ViewmodelSKComponentCompanion")))
@interface SharedViewmodelSKComponentCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedViewmodelSKComponentCompanion *shared __attribute__((swift_name("shared")));
@property void (^ _Nullable errorTreatment)(SharedViewmodelSKComponent<id> *, SharedKotlinException *, NSString * _Nullable) __attribute__((swift_name("errorTreatment")));
@end;

__attribute__((swift_name("KotlinCoroutineContextElement")))
@protocol SharedKotlinCoroutineContextElement <SharedKotlinCoroutineContext>
@required
@property (readonly) id<SharedKotlinCoroutineContextKey> key __attribute__((swift_name("key")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreJob")))
@protocol SharedKotlinx_coroutines_coreJob <SharedKotlinCoroutineContextElement>
@required
- (id<SharedKotlinx_coroutines_coreChildHandle>)attachChildChild:(id<SharedKotlinx_coroutines_coreChildJob>)child __attribute__((swift_name("attachChild(child:)")));
- (void)cancelCause:(SharedKotlinCancellationException * _Nullable)cause __attribute__((swift_name("cancel(cause:)")));
- (SharedKotlinCancellationException *)getCancellationException __attribute__((swift_name("getCancellationException()")));
- (id<SharedKotlinx_coroutines_coreDisposableHandle>)invokeOnCompletionOnCancelling:(BOOL)onCancelling invokeImmediately:(BOOL)invokeImmediately handler:(void (^)(SharedKotlinThrowable * _Nullable))handler __attribute__((swift_name("invokeOnCompletion(onCancelling:invokeImmediately:handler:)")));
- (id<SharedKotlinx_coroutines_coreDisposableHandle>)invokeOnCompletionHandler:(void (^)(SharedKotlinThrowable * _Nullable))handler __attribute__((swift_name("invokeOnCompletion(handler:)")));

/**
 @note This method converts instances of CancellationException to errors.
 Other uncaught Kotlin exceptions are fatal.
*/
- (void)joinWithCompletionHandler:(void (^)(SharedKotlinUnit * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("join(completionHandler:)")));
- (id<SharedKotlinx_coroutines_coreJob>)plusOther:(id<SharedKotlinx_coroutines_coreJob>)other __attribute__((swift_name("plus(other:)"))) __attribute__((unavailable("Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")));
- (BOOL)start_ __attribute__((swift_name("start()")));
@property (readonly) id<SharedKotlinSequence> children __attribute__((swift_name("children")));
@property (readonly) BOOL isActive __attribute__((swift_name("isActive")));
@property (readonly) BOOL isCancelled __attribute__((swift_name("isCancelled")));
@property (readonly) BOOL isCompleted __attribute__((swift_name("isCompleted")));
@property (readonly) id<SharedKotlinx_coroutines_coreSelectClause0> onJoin __attribute__((swift_name("onJoin")));
@end;

__attribute__((swift_name("KotlinComparable")))
@protocol SharedKotlinComparable
@required
- (int32_t)compareToOther:(id _Nullable)other __attribute__((swift_name("compareTo(other:)")));
@end;

__attribute__((swift_name("KotlinEnum")))
@interface SharedKotlinEnum<E> : SharedBase <SharedKotlinComparable>
- (instancetype)initWithName:(NSString *)name ordinal:(int32_t)ordinal __attribute__((swift_name("init(name:ordinal:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedKotlinEnumCompanion *companion __attribute__((swift_name("companion")));
- (int32_t)compareToOther:(E)other __attribute__((swift_name("compareTo(other:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *name __attribute__((swift_name("name")));
@property (readonly) int32_t ordinal __attribute__((swift_name("ordinal")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Kotlinx_coroutines_coreCoroutineStart")))
@interface SharedKotlinx_coroutines_coreCoroutineStart : SharedKotlinEnum<SharedKotlinx_coroutines_coreCoroutineStart *>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
- (instancetype)initWithName:(NSString *)name ordinal:(int32_t)ordinal __attribute__((swift_name("init(name:ordinal:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@property (class, readonly) SharedKotlinx_coroutines_coreCoroutineStart *default_ __attribute__((swift_name("default_")));
@property (class, readonly) SharedKotlinx_coroutines_coreCoroutineStart *lazy __attribute__((swift_name("lazy")));
@property (class, readonly) SharedKotlinx_coroutines_coreCoroutineStart *atomic __attribute__((swift_name("atomic")));
@property (class, readonly) SharedKotlinx_coroutines_coreCoroutineStart *undispatched __attribute__((swift_name("undispatched")));
+ (SharedKotlinArray<SharedKotlinx_coroutines_coreCoroutineStart *> *)values __attribute__((swift_name("values()")));
@property (readonly) BOOL isLazy __attribute__((swift_name("isLazy")));
@end;

__attribute__((swift_name("KotlinFunction")))
@protocol SharedKotlinFunction
@required
@end;

__attribute__((swift_name("KotlinSuspendFunction1")))
@protocol SharedKotlinSuspendFunction1 <SharedKotlinFunction>
@required

/**
 @note This method converts instances of CancellationException to errors.
 Other uncaught Kotlin exceptions are fatal.
*/
- (void)invokeP1:(id _Nullable)p1 completionHandler:(void (^)(id _Nullable_result, NSError * _Nullable))completionHandler __attribute__((swift_name("invoke(p1:completionHandler:)")));
@end;

__attribute__((swift_name("KotlinThrowable")))
@interface SharedKotlinThrowable : SharedBase
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithCause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer));
- (SharedKotlinArray<NSString *> *)getStackTrace __attribute__((swift_name("getStackTrace()")));
- (void)printStackTrace __attribute__((swift_name("printStackTrace()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedKotlinThrowable * _Nullable cause __attribute__((swift_name("cause")));
@property (readonly) NSString * _Nullable message __attribute__((swift_name("message")));
- (NSError *)asError __attribute__((swift_name("asError()")));
@end;

__attribute__((swift_name("KotlinException")))
@interface SharedKotlinException : SharedKotlinThrowable
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithCause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer));
@end;

__attribute__((swift_name("CorePoker")))
@interface SharedCorePoker : SharedBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (void)addObserverObserver:(void (^)(void))observer __attribute__((swift_name("addObserver(observer:)")));
- (void)removeObserverObserver:(void (^)(void))observer __attribute__((swift_name("removeObserver(observer:)")));
@property SharedMutableSet<SharedKotlinUnit *(^)(void)> *observers __attribute__((swift_name("observers")));
@end;

__attribute__((swift_name("ModelcontractSKData")))
@protocol SharedModelcontractSKData
@required

/**
 @note This method converts instances of CancellationException to errors.
 Other uncaught Kotlin exceptions are fatal.
*/
- (void)fallBackValueWithCompletionHandler:(void (^)(id _Nullable_result, NSError * _Nullable))completionHandler __attribute__((swift_name("fallBackValue(completionHandler:)")));

/**
 @note This method converts instances of CancellationException to errors.
 Other uncaught Kotlin exceptions are fatal.
*/
- (void)getValidity:(SharedLong * _Nullable)validity completionHandler:(void (^)(id _Nullable_result, NSError * _Nullable))completionHandler __attribute__((swift_name("get(validity:completionHandler:)")));

/**
 @note This method converts instances of CancellationException to errors.
 Other uncaught Kotlin exceptions are fatal.
*/
- (void)getDirectWithCompletionHandler:(void (^)(id _Nullable_result, NSError * _Nullable))completionHandler __attribute__((swift_name("getDirect(completionHandler:)")));

/**
 @note This method converts instances of CancellationException to errors.
 Other uncaught Kotlin exceptions are fatal.
*/
- (void)updateWithCompletionHandler:(void (^)(id _Nullable_result, NSError * _Nullable))completionHandler __attribute__((swift_name("update(completionHandler:)")));
@property (readonly) SharedModelcontractDatedData<id> * _Nullable _current __attribute__((swift_name("_current")));
@property (readonly) int64_t defaultValidity __attribute__((swift_name("defaultValidity")));
@property (readonly) id<SharedKotlinx_coroutines_coreFlow> flow __attribute__((swift_name("flow")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreCompletableJob")))
@protocol SharedKotlinx_coroutines_coreCompletableJob <SharedKotlinx_coroutines_coreJob>
@required
- (BOOL)complete __attribute__((swift_name("complete()")));
- (BOOL)completeExceptionallyException:(SharedKotlinThrowable *)exception __attribute__((swift_name("completeExceptionally(exception:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ViewmodelSKLoader")))
@interface SharedViewmodelSKLoader : SharedViewmodelSKComponent<id<SharedViewcontractSKLoaderVC>>
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (BOOL)isLoading __attribute__((swift_name("isLoading()")));
- (BOOL)isNotLoading __attribute__((swift_name("isNotLoading()")));
- (void)workEnded __attribute__((swift_name("workEnded()")));
- (void)workStarted __attribute__((swift_name("workStarted()")));
@property (readonly) id<SharedViewcontractSKLoaderVC> view __attribute__((swift_name("view")));
@end;

__attribute__((swift_name("ViewcontractSKTransition")))
@protocol SharedViewcontractSKTransition
@required
@end;

__attribute__((swift_name("ViewmodelSKStack")))
@interface SharedViewmodelSKStack : SharedViewmodelSKComponent<id<SharedViewcontractSKStackVC>>
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (void)onRemove __attribute__((swift_name("onRemove()")));
- (void)popTransition:(id<SharedViewcontractSKTransition> _Nullable)transition ifRoot:(void (^ _Nullable)(void))ifRoot __attribute__((swift_name("pop(transition:ifRoot:)")));
- (void)pushScreen:(SharedViewmodelSKScreen<id> *)screen transition:(id<SharedViewcontractSKTransition> _Nullable)transition __attribute__((swift_name("push(screen:transition:)")));
- (void)removeScreen:(SharedViewmodelSKScreen<id> *)screen transition:(id<SharedViewcontractSKTransition> _Nullable)transition __attribute__((swift_name("remove(screen:transition:)")));
- (void)replaceOldScreen:(SharedViewmodelSKScreen<id> *)oldScreen newScreen:(SharedViewmodelSKScreen<id> *)newScreen transition:(id<SharedViewcontractSKTransition> _Nullable)transition __attribute__((swift_name("replace(oldScreen:newScreen:transition:)")));
@property SharedViewmodelSKScreen<id> *content __attribute__((swift_name("content")));
@property SharedViewmodelSKStackState *state __attribute__((swift_name("state")));
@property (readonly) id<SharedViewcontractSKStackVC> view __attribute__((swift_name("view")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ViewmodelSKBottomSheet")))
@interface SharedViewmodelSKBottomSheet : SharedViewmodelSKComponent<id<SharedViewcontractSKBottomSheetVC>>
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (void)dismiss __attribute__((swift_name("dismiss()")));
- (void)showScreen:(SharedViewmodelSKScreen<id> *)screen onDismiss:(void (^ _Nullable)(void))onDismiss expanded:(BOOL)expanded __attribute__((swift_name("show(screen:onDismiss:expanded:)")));
@property SharedViewmodelSKScreen<id> * _Nullable shownScreen __attribute__((swift_name("shownScreen")));
@property (readonly) id<SharedViewcontractSKBottomSheetVC> view __attribute__((swift_name("view")));
@end;

__attribute__((swift_name("ViewmodelSKButton")))
@interface SharedViewmodelSKButton : SharedViewmodelSKComponent<id<SharedViewcontractSKButtonVC>>
- (instancetype)initWithLabel:(NSString * _Nullable)label enabled:(SharedBoolean * _Nullable)enabled hidden:(SharedBoolean * _Nullable)hidden onTap:(void (^ _Nullable)(void))onTap __attribute__((swift_name("init(label:enabled:hidden:onTap:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
@property SharedBoolean * _Nullable enabled __attribute__((swift_name("enabled")));
@property SharedBoolean * _Nullable hidden __attribute__((swift_name("hidden")));
@property NSString * _Nullable label __attribute__((swift_name("label")));
@property (readonly) id<SharedViewcontractSKButtonVC> view __attribute__((swift_name("view")));
@end;

__attribute__((swift_name("KotlinSuspendFunction0")))
@protocol SharedKotlinSuspendFunction0 <SharedKotlinFunction>
@required

/**
 @note This method converts instances of CancellationException to errors.
 Other uncaught Kotlin exceptions are fatal.
*/
- (void)invokeWithCompletionHandler:(void (^)(id _Nullable_result, NSError * _Nullable))completionHandler __attribute__((swift_name("invoke(completionHandler:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ViewcontractSKUri")))
@interface SharedViewcontractSKUri : SharedBase
- (instancetype)initWithScheme:(NSString * _Nullable)scheme host:(NSString * _Nullable)host pathSegments:(NSArray<NSString *> *)pathSegments parameters:(NSDictionary<NSString *, NSArray<NSString *> *> *)parameters __attribute__((swift_name("init(scheme:host:pathSegments:parameters:)"))) __attribute__((objc_designated_initializer));
- (NSString * _Nullable)component1 __attribute__((swift_name("component1()")));
- (NSString * _Nullable)component2 __attribute__((swift_name("component2()")));
- (NSArray<NSString *> *)component3 __attribute__((swift_name("component3()")));
- (NSDictionary<NSString *, NSArray<NSString *> *> *)component4 __attribute__((swift_name("component4()")));
- (SharedViewcontractSKUri *)doCopyScheme:(NSString * _Nullable)scheme host:(NSString * _Nullable)host pathSegments:(NSArray<NSString *> *)pathSegments parameters:(NSDictionary<NSString *, NSArray<NSString *> *> *)parameters __attribute__((swift_name("doCopy(scheme:host:pathSegments:parameters:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString * _Nullable host __attribute__((swift_name("host")));
@property (readonly) NSDictionary<NSString *, NSArray<NSString *> *> *parameters __attribute__((swift_name("parameters")));
@property (readonly) NSArray<NSString *> *pathSegments __attribute__((swift_name("pathSegments")));
@property (readonly) NSString * _Nullable scheme __attribute__((swift_name("scheme")));
@end;

__attribute__((swift_name("KotlinRuntimeException")))
@interface SharedKotlinRuntimeException : SharedKotlinException
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithCause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer));
@end;

__attribute__((swift_name("KotlinIllegalStateException")))
@interface SharedKotlinIllegalStateException : SharedKotlinRuntimeException
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithCause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer));
@end;

__attribute__((swift_name("KotlinCancellationException")))
@interface SharedKotlinCancellationException : SharedKotlinIllegalStateException
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithCause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KotlinUnit")))
@interface SharedKotlinUnit : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)unit __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKotlinUnit *shared __attribute__((swift_name("shared")));
- (NSString *)description __attribute__((swift_name("description()")));
@end;

__attribute__((swift_name("ViewcontractSKButtonVC")))
@protocol SharedViewcontractSKButtonVC <SharedViewcontractSKComponentVC>
@required
@property SharedBoolean * _Nullable enabled __attribute__((swift_name("enabled")));
@property SharedBoolean * _Nullable hidden __attribute__((swift_name("hidden")));
@property NSString * _Nullable label __attribute__((swift_name("label")));
@property void (^ _Nullable onTap)(void) __attribute__((swift_name("onTap")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ViewcontractStyle")))
@interface SharedViewcontractStyle : SharedBase
- (instancetype)initWithName:(NSString *)name __attribute__((swift_name("init(name:)"))) __attribute__((objc_designated_initializer));
@property (readonly) NSString *name __attribute__((swift_name("name")));
@end;

__attribute__((swift_name("ModelcontractModelInjector")))
@protocol SharedModelcontractModelInjector
@required
@end;

__attribute__((swift_name("ModelcontractPlurals")))
@protocol SharedModelcontractPlurals
@required
@end;

__attribute__((swift_name("ModelcontractStrings")))
@protocol SharedModelcontractStrings
@required
@end;

__attribute__((swift_name("ViewcontractCoreViewInjector")))
@protocol SharedViewcontractCoreViewInjector
@required
- (id<SharedViewcontractSKAlertVC>)alert __attribute__((swift_name("alert()")));
- (id<SharedViewcontractSKBottomSheetVC>)bottomSheet __attribute__((swift_name("bottomSheet()")));
- (id<SharedViewcontractSKButtonVC>)buttonOnTapInitial:(void (^ _Nullable)(void))onTapInitial labelInitial:(NSString * _Nullable)labelInitial enabledInitial:(SharedBoolean * _Nullable)enabledInitial hiddenInitial:(SharedBoolean * _Nullable)hiddenInitial __attribute__((swift_name("button(onTapInitial:labelInitial:enabledInitial:hiddenInitial:)")));
- (id<SharedViewcontractSKComboVC>)comboHint:(NSString * _Nullable)hint onSelected:(void (^ _Nullable)(id _Nullable))onSelected choicesInitial:(NSArray<SharedViewcontractSKComboVCChoice *> *)choicesInitial selectedInitial:(SharedViewcontractSKComboVCChoice * _Nullable)selectedInitial enabledInitial:(SharedBoolean * _Nullable)enabledInitial hiddenInitial:(SharedBoolean * _Nullable)hiddenInitial dropDownDisplayedInitial:(BOOL)dropDownDisplayedInitial __attribute__((swift_name("combo(hint:onSelected:choicesInitial:selectedInitial:enabledInitial:hiddenInitial:dropDownDisplayedInitial:)")));
- (id<SharedViewcontractSKFrameVC>)frameScreens:(NSSet<id<SharedViewcontractSKScreenVC>> *)screens screenInitial:(id<SharedViewcontractSKScreenVC> _Nullable)screenInitial __attribute__((swift_name("frame(screens:screenInitial:)")));
- (id<SharedViewcontractSKImageButtonVC>)imageButtonOnTapInitial:(void (^ _Nullable)(void))onTapInitial iconInitial:(SharedViewcontractIcon *)iconInitial enabledInitial:(SharedBoolean * _Nullable)enabledInitial hiddenInitial:(SharedBoolean * _Nullable)hiddenInitial __attribute__((swift_name("imageButton(onTapInitial:iconInitial:enabledInitial:hiddenInitial:)")));
- (id<SharedViewcontractSKInputVC>)inputOnInputText:(void (^)(NSString * _Nullable))onInputText type:(SharedViewcontractSKInputVCType * _Nullable)type maxSize:(SharedInt * _Nullable)maxSize onFocusLost:(void (^ _Nullable)(void))onFocusLost onDone:(void (^ _Nullable)(NSString * _Nullable))onDone hintInitial:(NSString * _Nullable)hintInitial textInitial:(NSString * _Nullable)textInitial errorInitial:(NSString * _Nullable)errorInitial hiddenInitial:(SharedBoolean * _Nullable)hiddenInitial enabledInitial:(SharedBoolean * _Nullable)enabledInitial __attribute__((swift_name("input(onInputText:type:maxSize:onFocusLost:onDone:hintInitial:textInitial:errorInitial:hiddenInitial:enabledInitial:)")));
- (id<SharedViewcontractSKSimpleInputVC>)inputSimpleOnInputText:(void (^)(NSString * _Nullable))onInputText type:(SharedViewcontractSKInputVCType * _Nullable)type maxSize:(SharedInt * _Nullable)maxSize onFocusLost:(void (^ _Nullable)(void))onFocusLost onDone:(void (^ _Nullable)(NSString * _Nullable))onDone hintInitial:(NSString * _Nullable)hintInitial textInitial:(NSString * _Nullable)textInitial errorInitial:(NSString * _Nullable)errorInitial hiddenInitial:(SharedBoolean * _Nullable)hiddenInitial enabledInitial:(SharedBoolean * _Nullable)enabledInitial __attribute__((swift_name("inputSimple(onInputText:type:maxSize:onFocusLost:onDone:hintInitial:textInitial:errorInitial:hiddenInitial:enabledInitial:)")));
- (id<SharedViewcontractSKInputWithSuggestionsVC>)inputWithSuggestionsHint:(NSString * _Nullable)hint onSelected:(void (^ _Nullable)(id _Nullable))onSelected choicesInitial:(NSArray<SharedViewcontractSKComboVCChoice *> *)choicesInitial selectedInitial:(SharedViewcontractSKComboVCChoice * _Nullable)selectedInitial enabledInitial:(SharedBoolean * _Nullable)enabledInitial hiddenInitial:(SharedBoolean * _Nullable)hiddenInitial dropDownDisplayedInitial:(BOOL)dropDownDisplayedInitial onInputText:(void (^)(NSString * _Nullable))onInputText __attribute__((swift_name("inputWithSuggestions(hint:onSelected:choicesInitial:selectedInitial:enabledInitial:hiddenInitial:dropDownDisplayedInitial:onInputText:)")));
- (id<SharedViewcontractSKLoaderVC>)loader_ __attribute__((swift_name("loader()")));
- (id<SharedViewcontractSKPagerVC>)pagerScreens:(NSArray<id<SharedViewcontractSKScreenVC>> *)screens onSwipeToPage:(void (^ _Nullable)(SharedInt *))onSwipeToPage initialSelectedPageIndex:(int32_t)initialSelectedPageIndex swipable:(BOOL)swipable __attribute__((swift_name("pager(screens:onSwipeToPage:initialSelectedPageIndex:swipable:)")));
- (id<SharedViewcontractSKPagerWithTabsVC>)pagerWithTabsPager:(id<SharedViewcontractSKPagerVC>)pager labels:(NSArray<NSString *> *)labels __attribute__((swift_name("pagerWithTabs(pager:labels:)")));
- (id<SharedViewcontractSKStackVC>)rootStack __attribute__((swift_name("rootStack()")));
- (id<SharedViewcontractSKBoxVC>)skBoxItemsInitial:(NSArray<id<SharedViewcontractSKComponentVC>> *)itemsInitial hiddenInitial:(SharedBoolean * _Nullable)hiddenInitial __attribute__((swift_name("skBox(itemsInitial:hiddenInitial:)")));
- (id<SharedViewcontractSKListVC>)skListVertical:(BOOL)vertical reverse:(BOOL)reverse nbColumns:(SharedInt * _Nullable)nbColumns animate:(BOOL)animate animateItem:(BOOL)animateItem __attribute__((swift_name("skList(vertical:reverse:nbColumns:animate:animateItem:)")));
- (id<SharedViewcontractSKSnackBarVC>)snackBar __attribute__((swift_name("snackBar()")));
- (id<SharedViewcontractSKStackVC>)stack __attribute__((swift_name("stack()")));
- (id<SharedViewcontractSKWebViewVC>)webViewConfig:(SharedViewcontractSKWebViewVCConfig *)config openUrlInitial:(SharedViewcontractSKWebViewVCOpenUrl * _Nullable)openUrlInitial __attribute__((swift_name("webView(config:openUrlInitial:)")));
- (id<SharedViewcontractSKWindowPopupVC>)windowPopup __attribute__((swift_name("windowPopup()")));
@end;

__attribute__((swift_name("KotlinCoroutineContextKey")))
@protocol SharedKotlinCoroutineContextKey
@required
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreDisposableHandle")))
@protocol SharedKotlinx_coroutines_coreDisposableHandle
@required
- (void)dispose __attribute__((swift_name("dispose()")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreChildHandle")))
@protocol SharedKotlinx_coroutines_coreChildHandle <SharedKotlinx_coroutines_coreDisposableHandle>
@required
- (BOOL)childCancelledCause:(SharedKotlinThrowable *)cause __attribute__((swift_name("childCancelled(cause:)")));
@property (readonly) id<SharedKotlinx_coroutines_coreJob> _Nullable parent __attribute__((swift_name("parent")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreChildJob")))
@protocol SharedKotlinx_coroutines_coreChildJob <SharedKotlinx_coroutines_coreJob>
@required
- (void)parentCancelledParentJob:(id<SharedKotlinx_coroutines_coreParentJob>)parentJob __attribute__((swift_name("parentCancelled(parentJob:)")));
@end;

__attribute__((swift_name("KotlinSequence")))
@protocol SharedKotlinSequence
@required
- (id<SharedKotlinIterator>)iterator __attribute__((swift_name("iterator()")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreSelectClause0")))
@protocol SharedKotlinx_coroutines_coreSelectClause0
@required
- (void)registerSelectClause0Select:(id<SharedKotlinx_coroutines_coreSelectInstance>)select block:(id<SharedKotlinSuspendFunction0>)block __attribute__((swift_name("registerSelectClause0(select:block:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KotlinEnumCompanion")))
@interface SharedKotlinEnumCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKotlinEnumCompanion *shared __attribute__((swift_name("shared")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KotlinArray")))
@interface SharedKotlinArray<T> : SharedBase
+ (instancetype)arrayWithSize:(int32_t)size init:(T _Nullable (^)(SharedInt *))init __attribute__((swift_name("init(size:init:)")));
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
- (T _Nullable)getIndex:(int32_t)index __attribute__((swift_name("get(index:)")));
- (id<SharedKotlinIterator>)iterator __attribute__((swift_name("iterator()")));
- (void)setIndex:(int32_t)index value:(T _Nullable)value __attribute__((swift_name("set(index:value:)")));
@property (readonly) int32_t size __attribute__((swift_name("size")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ModelcontractDatedData")))
@interface SharedModelcontractDatedData<D> : SharedBase
- (instancetype)initWithData:(D _Nullable)data timestamp:(int64_t)timestamp __attribute__((swift_name("init(data:timestamp:)"))) __attribute__((objc_designated_initializer));
- (D _Nullable)component1 __attribute__((swift_name("component1()")));
- (int64_t)component2 __attribute__((swift_name("component2()")));
- (SharedModelcontractDatedData<D> *)doCopyData:(D _Nullable)data timestamp:(int64_t)timestamp __attribute__((swift_name("doCopy(data:timestamp:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) D _Nullable data __attribute__((swift_name("data")));
@property (readonly) int64_t timestamp __attribute__((swift_name("timestamp")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreFlow")))
@protocol SharedKotlinx_coroutines_coreFlow
@required

/**
 @note This method converts instances of CancellationException to errors.
 Other uncaught Kotlin exceptions are fatal.
*/
- (void)collectCollector:(id<SharedKotlinx_coroutines_coreFlowCollector>)collector completionHandler:(void (^)(SharedKotlinUnit * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("collect(collector:completionHandler:)")));
@end;

__attribute__((swift_name("ViewcontractSKLoaderVC")))
@protocol SharedViewcontractSKLoaderVC <SharedViewcontractSKComponentVC>
@required
@property BOOL visible __attribute__((swift_name("visible")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ViewmodelSKStack.State")))
@interface SharedViewmodelSKStackState : SharedBase
- (instancetype)initWithScreens:(NSArray<SharedViewmodelSKScreen<id> *> *)screens transition:(id<SharedViewcontractSKTransition> _Nullable)transition __attribute__((swift_name("init(screens:transition:)"))) __attribute__((objc_designated_initializer));
@property (readonly) NSArray<SharedViewmodelSKScreen<id> *> *screens __attribute__((swift_name("screens")));
@property (readonly) id<SharedViewcontractSKTransition> _Nullable transition __attribute__((swift_name("transition")));
@end;

__attribute__((swift_name("ViewcontractSKStackVC")))
@protocol SharedViewcontractSKStackVC <SharedViewcontractSKComponentVC>
@required
@property SharedViewcontractSKStackVCState *state __attribute__((swift_name("state")));
@end;

__attribute__((swift_name("ViewcontractSKBottomSheetVC")))
@protocol SharedViewcontractSKBottomSheetVC <SharedViewcontractSKComponentVC>
@required
@property SharedViewcontractSKBottomSheetVCShown * _Nullable state __attribute__((swift_name("state")));
@end;

__attribute__((swift_name("ViewcontractSKAlertVC")))
@protocol SharedViewcontractSKAlertVC <SharedViewcontractSKComponentVC>
@required
@property SharedViewcontractSKAlertVCShown * _Nullable state __attribute__((swift_name("state")));
@end;

__attribute__((swift_name("ViewcontractSKComboVC")))
@protocol SharedViewcontractSKComboVC <SharedViewcontractSKComponentVC>
@required
@property NSArray<SharedViewcontractSKComboVCChoice *> *choices __attribute__((swift_name("choices")));
@property BOOL dropDownDisplayed __attribute__((swift_name("dropDownDisplayed")));
@property SharedBoolean * _Nullable enabled __attribute__((swift_name("enabled")));
@property SharedBoolean * _Nullable hidden __attribute__((swift_name("hidden")));
@property (readonly) NSString * _Nullable hint __attribute__((swift_name("hint")));
@property (readonly) void (^ _Nullable onSelected)(id _Nullable) __attribute__((swift_name("onSelected")));
@property SharedViewcontractSKComboVCChoice * _Nullable selected __attribute__((swift_name("selected")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ViewcontractSKComboVCChoice")))
@interface SharedViewcontractSKComboVCChoice : SharedBase
- (instancetype)initWithData:(id _Nullable)data text:(NSString *)text strikethrough:(BOOL)strikethrough colored:(BOOL)colored inputText:(NSString *)inputText __attribute__((swift_name("init(data:text:strikethrough:colored:inputText:)"))) __attribute__((objc_designated_initializer));
@property (readonly) BOOL colored __attribute__((swift_name("colored")));
@property (readonly) id _Nullable data __attribute__((swift_name("data")));
@property (readonly) NSString *inputText __attribute__((swift_name("inputText")));
@property (readonly) BOOL strikethrough __attribute__((swift_name("strikethrough")));
@property (readonly) NSString *text __attribute__((swift_name("text")));
@end;

__attribute__((swift_name("ViewcontractSKFrameVC")))
@protocol SharedViewcontractSKFrameVC <SharedViewcontractSKComponentVC>
@required
@property id<SharedViewcontractSKScreenVC> _Nullable screen __attribute__((swift_name("screen")));
@property (readonly) NSSet<id<SharedViewcontractSKScreenVC>> *screens __attribute__((swift_name("screens")));
@end;

__attribute__((swift_name("ViewcontractSKImageButtonVC")))
@protocol SharedViewcontractSKImageButtonVC <SharedViewcontractSKComponentVC>
@required
@property SharedBoolean * _Nullable enabled __attribute__((swift_name("enabled")));
@property SharedBoolean * _Nullable hidden __attribute__((swift_name("hidden")));
@property SharedViewcontractIcon *icon __attribute__((swift_name("icon")));
@property void (^ _Nullable onTap)(void) __attribute__((swift_name("onTap")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ViewcontractIcon")))
@interface SharedViewcontractIcon : SharedBase
- (instancetype)initWithName:(NSString *)name __attribute__((swift_name("init(name:)"))) __attribute__((objc_designated_initializer));
@property (readonly) NSString *name __attribute__((swift_name("name")));
@end;

__attribute__((swift_name("ViewcontractSKInputVC")))
@protocol SharedViewcontractSKInputVC <SharedViewcontractSKComponentVC>
@required
- (void)requestFocus __attribute__((swift_name("requestFocus()")));
@property SharedBoolean * _Nullable enabled __attribute__((swift_name("enabled")));
@property NSString * _Nullable error __attribute__((swift_name("error")));
@property SharedBoolean * _Nullable hidden __attribute__((swift_name("hidden")));
@property NSString * _Nullable hint __attribute__((swift_name("hint")));
@property (readonly) SharedInt * _Nullable maxSize __attribute__((swift_name("maxSize")));
@property (readonly) void (^ _Nullable onDone)(NSString * _Nullable) __attribute__((swift_name("onDone")));
@property (readonly) void (^ _Nullable onFocusLost)(void) __attribute__((swift_name("onFocusLost")));
@property (readonly) void (^onInputText)(NSString * _Nullable) __attribute__((swift_name("onInputText")));
@property NSString * _Nullable text __attribute__((swift_name("text")));
@property (readonly) SharedViewcontractSKInputVCType * _Nullable type __attribute__((swift_name("type")));
@end;

__attribute__((swift_name("ViewcontractSKInputVCType")))
@interface SharedViewcontractSKInputVCType : SharedBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
@end;

__attribute__((swift_name("ViewcontractSKSimpleInputVC")))
@protocol SharedViewcontractSKSimpleInputVC <SharedViewcontractSKInputVC>
@required
@end;

__attribute__((swift_name("ViewcontractSKInputWithSuggestionsVC")))
@protocol SharedViewcontractSKInputWithSuggestionsVC <SharedViewcontractSKComboVC>
@required
- (void)requestFocus __attribute__((swift_name("requestFocus()")));
@property (readonly) void (^onInputText)(NSString * _Nullable) __attribute__((swift_name("onInputText")));
@end;

__attribute__((swift_name("ViewcontractSKPagerVC")))
@protocol SharedViewcontractSKPagerVC <SharedViewcontractSKComponentVC>
@required
@property (readonly) void (^ _Nullable onSwipeToPage)(SharedInt *) __attribute__((swift_name("onSwipeToPage")));
@property NSArray<id<SharedViewcontractSKScreenVC>> *screens __attribute__((swift_name("screens")));
@property int32_t selectedPageIndex __attribute__((swift_name("selectedPageIndex")));
@property (readonly) BOOL swipable __attribute__((swift_name("swipable")));
@end;

__attribute__((swift_name("ViewcontractSKPagerWithTabsVC")))
@protocol SharedViewcontractSKPagerWithTabsVC <SharedViewcontractSKComponentVC>
@required
@property NSArray<NSString *> *labels __attribute__((swift_name("labels")));
@property (readonly) id<SharedViewcontractSKPagerVC> pager __attribute__((swift_name("pager")));
@end;

__attribute__((swift_name("ViewcontractSKBoxVC")))
@protocol SharedViewcontractSKBoxVC <SharedViewcontractSKComponentVC>
@required
@property SharedBoolean * _Nullable hidden __attribute__((swift_name("hidden")));
@property NSArray<id<SharedViewcontractSKComponentVC>> *items __attribute__((swift_name("items")));
@end;

__attribute__((swift_name("ViewcontractSKListVC")))
@protocol SharedViewcontractSKListVC <SharedViewcontractSKComponentVC>
@required
- (void)scrollToPositionPosition:(int32_t)position __attribute__((swift_name("scrollToPosition(position:)")));
@property NSArray<SharedViewcontractSKListVCItem *> *items __attribute__((swift_name("items")));
@end;

__attribute__((swift_name("ViewcontractSKSnackBarVC")))
@protocol SharedViewcontractSKSnackBarVC <SharedViewcontractSKComponentVC>
@required
@property SharedViewcontractSKSnackBarVCShown * _Nullable state __attribute__((swift_name("state")));
@end;

__attribute__((swift_name("ViewcontractSKWebViewVC")))
@protocol SharedViewcontractSKWebViewVC <SharedViewcontractSKComponentVC>
@required
@property (readonly) SharedViewcontractSKWebViewVCConfig *config __attribute__((swift_name("config")));
@property SharedViewcontractSKWebViewVCBackRequest * _Nullable goBack __attribute__((swift_name("goBack")));
@property SharedViewcontractSKWebViewVCOpenUrl * _Nullable openUrl __attribute__((swift_name("openUrl")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ViewcontractSKWebViewVCConfig")))
@interface SharedViewcontractSKWebViewVCConfig : SharedBase
- (instancetype)initWithUserAgent:(NSString * _Nullable)userAgent redirect:(NSArray<SharedViewcontractSKWebViewVCRedirectParam *> *)redirect __attribute__((swift_name("init(userAgent:redirect:)"))) __attribute__((objc_designated_initializer));
- (NSString * _Nullable)component1 __attribute__((swift_name("component1()")));
- (NSArray<SharedViewcontractSKWebViewVCRedirectParam *> *)component2 __attribute__((swift_name("component2()")));
- (SharedViewcontractSKWebViewVCConfig *)doCopyUserAgent:(NSString * _Nullable)userAgent redirect:(NSArray<SharedViewcontractSKWebViewVCRedirectParam *> *)redirect __attribute__((swift_name("doCopy(userAgent:redirect:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSArray<SharedViewcontractSKWebViewVCRedirectParam *> *redirect __attribute__((swift_name("redirect")));
@property (readonly) NSString * _Nullable userAgent __attribute__((swift_name("userAgent")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ViewcontractSKWebViewVCOpenUrl")))
@interface SharedViewcontractSKWebViewVCOpenUrl : SharedBase
- (instancetype)initWithUrl:(NSString *)url onFinished:(void (^ _Nullable)(void))onFinished javascriptOnFinished:(NSString * _Nullable)javascriptOnFinished onError:(void (^ _Nullable)(void))onError post:(NSDictionary<NSString *, NSString *> * _Nullable)post __attribute__((swift_name("init(url:onFinished:javascriptOnFinished:onError:post:)"))) __attribute__((objc_designated_initializer));
- (NSString *)component1 __attribute__((swift_name("component1()")));
- (void (^ _Nullable)(void))component2 __attribute__((swift_name("component2()")));
- (NSString * _Nullable)component3 __attribute__((swift_name("component3()")));
- (void (^ _Nullable)(void))component4 __attribute__((swift_name("component4()")));
- (NSDictionary<NSString *, NSString *> * _Nullable)component5 __attribute__((swift_name("component5()")));
- (SharedViewcontractSKWebViewVCOpenUrl *)doCopyUrl:(NSString *)url onFinished:(void (^ _Nullable)(void))onFinished javascriptOnFinished:(NSString * _Nullable)javascriptOnFinished onError:(void (^ _Nullable)(void))onError post:(NSDictionary<NSString *, NSString *> * _Nullable)post __attribute__((swift_name("doCopy(url:onFinished:javascriptOnFinished:onError:post:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString * _Nullable javascriptOnFinished __attribute__((swift_name("javascriptOnFinished")));
@property (readonly) void (^ _Nullable onError)(void) __attribute__((swift_name("onError")));
@property (readonly) void (^ _Nullable onFinished)(void) __attribute__((swift_name("onFinished")));
@property (readonly) NSDictionary<NSString *, NSString *> * _Nullable post __attribute__((swift_name("post")));
@property (readonly) NSString *url __attribute__((swift_name("url")));
@end;

__attribute__((swift_name("ViewcontractSKWindowPopupVC")))
@protocol SharedViewcontractSKWindowPopupVC <SharedViewcontractSKComponentVC>
@required
@property SharedViewcontractSKWindowPopupVCShown * _Nullable state __attribute__((swift_name("state")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreParentJob")))
@protocol SharedKotlinx_coroutines_coreParentJob <SharedKotlinx_coroutines_coreJob>
@required
- (SharedKotlinCancellationException *)getChildJobCancellationCause __attribute__((swift_name("getChildJobCancellationCause()")));
@end;

__attribute__((swift_name("KotlinIterator")))
@protocol SharedKotlinIterator
@required
- (BOOL)hasNext __attribute__((swift_name("hasNext()")));
- (id _Nullable)next __attribute__((swift_name("next()")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreSelectInstance")))
@protocol SharedKotlinx_coroutines_coreSelectInstance
@required
- (void)disposeOnSelectHandle:(id<SharedKotlinx_coroutines_coreDisposableHandle>)handle __attribute__((swift_name("disposeOnSelect(handle:)")));
- (id _Nullable)performAtomicTrySelectDesc:(SharedKotlinx_coroutines_coreAtomicDesc *)desc __attribute__((swift_name("performAtomicTrySelect(desc:)")));
- (void)resumeSelectWithExceptionException:(SharedKotlinThrowable *)exception __attribute__((swift_name("resumeSelectWithException(exception:)")));
- (BOOL)trySelect __attribute__((swift_name("trySelect()")));
- (id _Nullable)trySelectOtherOtherOp:(SharedKotlinx_coroutines_coreLockFreeLinkedListNodePrepareOp * _Nullable)otherOp __attribute__((swift_name("trySelectOther(otherOp:)")));
@property (readonly) id<SharedKotlinContinuation> completion __attribute__((swift_name("completion")));
@property (readonly) BOOL isSelected __attribute__((swift_name("isSelected")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreFlowCollector")))
@protocol SharedKotlinx_coroutines_coreFlowCollector
@required

/**
 @note This method converts instances of CancellationException to errors.
 Other uncaught Kotlin exceptions are fatal.
*/
- (void)emitValue:(id _Nullable)value completionHandler:(void (^)(SharedKotlinUnit * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("emit(value:completionHandler:)")));
@end;

__attribute__((swift_name("ViewcontractSKStackVCState")))
@interface SharedViewcontractSKStackVCState : SharedBase
- (instancetype)initWithScreens:(NSArray<id<SharedViewcontractSKScreenVC>> *)screens transition:(id<SharedViewcontractSKTransition> _Nullable)transition __attribute__((swift_name("init(screens:transition:)"))) __attribute__((objc_designated_initializer));
@property (readonly) NSArray<id<SharedViewcontractSKScreenVC>> *screens __attribute__((swift_name("screens")));
@property (readonly) id<SharedViewcontractSKTransition> _Nullable transition __attribute__((swift_name("transition")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ViewcontractSKBottomSheetVCShown")))
@interface SharedViewcontractSKBottomSheetVCShown : SharedBase
- (instancetype)initWithScreen:(id<SharedViewcontractSKScreenVC>)screen onDismiss:(void (^ _Nullable)(void))onDismiss expanded:(BOOL)expanded __attribute__((swift_name("init(screen:onDismiss:expanded:)"))) __attribute__((objc_designated_initializer));
- (id<SharedViewcontractSKScreenVC>)component1 __attribute__((swift_name("component1()")));
- (void (^ _Nullable)(void))component2 __attribute__((swift_name("component2()")));
- (BOOL)component3 __attribute__((swift_name("component3()")));
- (SharedViewcontractSKBottomSheetVCShown *)doCopyScreen:(id<SharedViewcontractSKScreenVC>)screen onDismiss:(void (^ _Nullable)(void))onDismiss expanded:(BOOL)expanded __attribute__((swift_name("doCopy(screen:onDismiss:expanded:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) BOOL expanded __attribute__((swift_name("expanded")));
@property (readonly) void (^ _Nullable onDismiss)(void) __attribute__((swift_name("onDismiss")));
@property (readonly) id<SharedViewcontractSKScreenVC> screen __attribute__((swift_name("screen")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ViewcontractSKAlertVCShown")))
@interface SharedViewcontractSKAlertVCShown : SharedBase
- (instancetype)initWithTitle:(NSString * _Nullable)title message:(NSString * _Nullable)message cancelable:(BOOL)cancelable mainButton:(SharedViewcontractSKAlertVCButton *)mainButton secondaryButton:(SharedViewcontractSKAlertVCButton * _Nullable)secondaryButton __attribute__((swift_name("init(title:message:cancelable:mainButton:secondaryButton:)"))) __attribute__((objc_designated_initializer));
- (NSString * _Nullable)component1 __attribute__((swift_name("component1()")));
- (NSString * _Nullable)component2 __attribute__((swift_name("component2()")));
- (BOOL)component3 __attribute__((swift_name("component3()")));
- (SharedViewcontractSKAlertVCButton *)component4 __attribute__((swift_name("component4()")));
- (SharedViewcontractSKAlertVCButton * _Nullable)component5 __attribute__((swift_name("component5()")));
- (SharedViewcontractSKAlertVCShown *)doCopyTitle:(NSString * _Nullable)title message:(NSString * _Nullable)message cancelable:(BOOL)cancelable mainButton:(SharedViewcontractSKAlertVCButton *)mainButton secondaryButton:(SharedViewcontractSKAlertVCButton * _Nullable)secondaryButton __attribute__((swift_name("doCopy(title:message:cancelable:mainButton:secondaryButton:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) BOOL cancelable __attribute__((swift_name("cancelable")));
@property (readonly) SharedViewcontractSKAlertVCButton *mainButton __attribute__((swift_name("mainButton")));
@property (readonly) NSString * _Nullable message __attribute__((swift_name("message")));
@property (readonly) SharedViewcontractSKAlertVCButton * _Nullable secondaryButton __attribute__((swift_name("secondaryButton")));
@property (readonly) NSString * _Nullable title __attribute__((swift_name("title")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ViewcontractSKListVCItem")))
@interface SharedViewcontractSKListVCItem : SharedBase
- (instancetype)initWithComponent:(id<SharedViewcontractSKComponentVC>)component id:(id)id onSwipe:(void (^ _Nullable)(void))onSwipe __attribute__((swift_name("init(component:id:onSwipe:)"))) __attribute__((objc_designated_initializer));
- (id<SharedViewcontractSKComponentVC>)component1 __attribute__((swift_name("component1()")));
- (id)component2 __attribute__((swift_name("component2()")));
- (void (^ _Nullable)(void))component3 __attribute__((swift_name("component3()")));
- (SharedViewcontractSKListVCItem *)doCopyComponent:(id<SharedViewcontractSKComponentVC>)component id:(id)id onSwipe:(void (^ _Nullable)(void))onSwipe __attribute__((swift_name("doCopy(component:id:onSwipe:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) id<SharedViewcontractSKComponentVC> component __attribute__((swift_name("component")));
@property (readonly) id id __attribute__((swift_name("id")));
@property (readonly) void (^ _Nullable onSwipe)(void) __attribute__((swift_name("onSwipe")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ViewcontractSKSnackBarVCShown")))
@interface SharedViewcontractSKSnackBarVCShown : SharedBase
- (instancetype)initWithMessage:(NSString *)message action:(SharedViewcontractSKSnackBarVCAction * _Nullable)action onTop:(BOOL)onTop __attribute__((swift_name("init(message:action:onTop:)"))) __attribute__((objc_designated_initializer));
- (NSString *)component1 __attribute__((swift_name("component1()")));
- (SharedViewcontractSKSnackBarVCAction * _Nullable)component2 __attribute__((swift_name("component2()")));
- (BOOL)component3 __attribute__((swift_name("component3()")));
- (SharedViewcontractSKSnackBarVCShown *)doCopyMessage:(NSString *)message action:(SharedViewcontractSKSnackBarVCAction * _Nullable)action onTop:(BOOL)onTop __attribute__((swift_name("doCopy(message:action:onTop:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedViewcontractSKSnackBarVCAction * _Nullable action __attribute__((swift_name("action")));
@property (readonly) NSString *message __attribute__((swift_name("message")));
@property (readonly) BOOL onTop __attribute__((swift_name("onTop")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ViewcontractSKWebViewVCBackRequest")))
@interface SharedViewcontractSKWebViewVCBackRequest : SharedBase
- (instancetype)initWithOnCantBack:(void (^ _Nullable)(void))onCantBack __attribute__((swift_name("init(onCantBack:)"))) __attribute__((objc_designated_initializer));
- (void (^ _Nullable)(void))component1 __attribute__((swift_name("component1()")));
- (SharedViewcontractSKWebViewVCBackRequest *)doCopyOnCantBack:(void (^ _Nullable)(void))onCantBack __attribute__((swift_name("doCopy(onCantBack:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) void (^ _Nullable onCantBack)(void) __attribute__((swift_name("onCantBack")));
@end;

__attribute__((swift_name("ViewcontractSKWebViewVCRedirectParam")))
@interface SharedViewcontractSKWebViewVCRedirectParam : SharedBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (BOOL)matchesUrl:(NSString *)url __attribute__((swift_name("matches(url:)")));
@property (readonly) SharedBoolean *(^onRedirect)(NSString *, NSDictionary<NSString *, NSString *> *) __attribute__((swift_name("onRedirect")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ViewcontractSKWindowPopupVCShown")))
@interface SharedViewcontractSKWindowPopupVCShown : SharedBase
- (instancetype)initWithComponent:(id<SharedViewcontractSKComponentVC>)component behavior:(SharedViewcontractSKWindowPopupVCBehavior *)behavior __attribute__((swift_name("init(component:behavior:)"))) __attribute__((objc_designated_initializer));
- (id<SharedViewcontractSKComponentVC>)component1 __attribute__((swift_name("component1()")));
- (SharedViewcontractSKWindowPopupVCBehavior *)component2 __attribute__((swift_name("component2()")));
- (SharedViewcontractSKWindowPopupVCShown *)doCopyComponent:(id<SharedViewcontractSKComponentVC>)component behavior:(SharedViewcontractSKWindowPopupVCBehavior *)behavior __attribute__((swift_name("doCopy(component:behavior:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedViewcontractSKWindowPopupVCBehavior *behavior __attribute__((swift_name("behavior")));
@property (readonly) id<SharedViewcontractSKComponentVC> component __attribute__((swift_name("component")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreAtomicDesc")))
@interface SharedKotlinx_coroutines_coreAtomicDesc : SharedBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (void)completeOp:(SharedKotlinx_coroutines_coreAtomicOp<id> *)op failure:(id _Nullable)failure __attribute__((swift_name("complete(op:failure:)")));
- (id _Nullable)prepareOp:(SharedKotlinx_coroutines_coreAtomicOp<id> *)op __attribute__((swift_name("prepare(op:)")));
@property SharedKotlinx_coroutines_coreAtomicOp<id> *atomicOp __attribute__((swift_name("atomicOp")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreOpDescriptor")))
@interface SharedKotlinx_coroutines_coreOpDescriptor : SharedBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (BOOL)isEarlierThanThat:(SharedKotlinx_coroutines_coreOpDescriptor *)that __attribute__((swift_name("isEarlierThan(that:)")));
- (id _Nullable)performAffected:(id _Nullable)affected __attribute__((swift_name("perform(affected:)")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedKotlinx_coroutines_coreAtomicOp<id> * _Nullable atomicOp __attribute__((swift_name("atomicOp")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Kotlinx_coroutines_coreLockFreeLinkedListNode.PrepareOp")))
@interface SharedKotlinx_coroutines_coreLockFreeLinkedListNodePrepareOp : SharedKotlinx_coroutines_coreOpDescriptor
- (instancetype)initWithAffected:(SharedKotlinx_coroutines_coreLockFreeLinkedListNode *)affected next:(SharedKotlinx_coroutines_coreLockFreeLinkedListNode *)next desc:(SharedKotlinx_coroutines_coreLockFreeLinkedListNodeAbstractAtomicDesc *)desc __attribute__((swift_name("init(affected:next:desc:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (void)finishPrepare __attribute__((swift_name("finishPrepare()")));
- (id _Nullable)performAffected:(id _Nullable)affected __attribute__((swift_name("perform(affected:)")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedKotlinx_coroutines_coreLockFreeLinkedListNode *affected __attribute__((swift_name("affected")));
@property (readonly) SharedKotlinx_coroutines_coreAtomicOp<id> *atomicOp __attribute__((swift_name("atomicOp")));
@property (readonly) SharedKotlinx_coroutines_coreLockFreeLinkedListNodeAbstractAtomicDesc *desc __attribute__((swift_name("desc")));
@property (readonly) SharedKotlinx_coroutines_coreLockFreeLinkedListNode *next __attribute__((swift_name("next")));
@end;

__attribute__((swift_name("KotlinContinuation")))
@protocol SharedKotlinContinuation
@required
- (void)resumeWithResult:(id _Nullable)result __attribute__((swift_name("resumeWith(result:)")));
@property (readonly) id<SharedKotlinCoroutineContext> context __attribute__((swift_name("context")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ViewcontractSKAlertVCButton")))
@interface SharedViewcontractSKAlertVCButton : SharedBase
- (instancetype)initWithLabel:(NSString *)label action:(void (^ _Nullable)(void))action __attribute__((swift_name("init(label:action:)"))) __attribute__((objc_designated_initializer));
- (NSString *)component1 __attribute__((swift_name("component1()")));
- (void (^ _Nullable)(void))component2 __attribute__((swift_name("component2()")));
- (SharedViewcontractSKAlertVCButton *)doCopyLabel:(NSString *)label action:(void (^ _Nullable)(void))action __attribute__((swift_name("doCopy(label:action:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) void (^ _Nullable action)(void) __attribute__((swift_name("action")));
@property (readonly) NSString *label __attribute__((swift_name("label")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ViewcontractSKSnackBarVCAction")))
@interface SharedViewcontractSKSnackBarVCAction : SharedBase
- (instancetype)initWithLabel:(NSString *)label action:(void (^)(void))action __attribute__((swift_name("init(label:action:)"))) __attribute__((objc_designated_initializer));
- (NSString *)component1 __attribute__((swift_name("component1()")));
- (void (^)(void))component2 __attribute__((swift_name("component2()")));
- (SharedViewcontractSKSnackBarVCAction *)doCopyLabel:(NSString *)label action:(void (^)(void))action __attribute__((swift_name("doCopy(label:action:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) void (^action)(void) __attribute__((swift_name("action")));
@property (readonly) NSString *label __attribute__((swift_name("label")));
@end;

__attribute__((swift_name("ViewcontractSKWindowPopupVCBehavior")))
@interface SharedViewcontractSKWindowPopupVCBehavior : SharedBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreAtomicOp")))
@interface SharedKotlinx_coroutines_coreAtomicOp<__contravariant T> : SharedKotlinx_coroutines_coreOpDescriptor
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (void)completeAffected:(T _Nullable)affected failure:(id _Nullable)failure __attribute__((swift_name("complete(affected:failure:)")));
- (id _Nullable)decideDecision:(id _Nullable)decision __attribute__((swift_name("decide(decision:)")));
- (id _Nullable)performAffected:(id _Nullable)affected __attribute__((swift_name("perform(affected:)")));
- (id _Nullable)prepareAffected:(T _Nullable)affected __attribute__((swift_name("prepare(affected:)")));
@property (readonly) SharedKotlinx_coroutines_coreAtomicOp<id> *atomicOp __attribute__((swift_name("atomicOp")));
@property (readonly) id _Nullable consensus __attribute__((swift_name("consensus")));
@property (readonly) BOOL isDecided __attribute__((swift_name("isDecided")));
@property (readonly) int64_t opSequence __attribute__((swift_name("opSequence")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreLockFreeLinkedListNode")))
@interface SharedKotlinx_coroutines_coreLockFreeLinkedListNode : SharedBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (void)addLastNode:(SharedKotlinx_coroutines_coreLockFreeLinkedListNode *)node __attribute__((swift_name("addLast(node:)")));
- (BOOL)addLastIfNode:(SharedKotlinx_coroutines_coreLockFreeLinkedListNode *)node condition:(SharedBoolean *(^)(void))condition __attribute__((swift_name("addLastIf(node:condition:)")));
- (BOOL)addLastIfPrevNode:(SharedKotlinx_coroutines_coreLockFreeLinkedListNode *)node predicate:(SharedBoolean *(^)(SharedKotlinx_coroutines_coreLockFreeLinkedListNode *))predicate __attribute__((swift_name("addLastIfPrev(node:predicate:)")));
- (BOOL)addLastIfPrevAndIfNode:(SharedKotlinx_coroutines_coreLockFreeLinkedListNode *)node predicate:(SharedBoolean *(^)(SharedKotlinx_coroutines_coreLockFreeLinkedListNode *))predicate condition:(SharedBoolean *(^)(void))condition __attribute__((swift_name("addLastIfPrevAndIf(node:predicate:condition:)")));
- (BOOL)addOneIfEmptyNode:(SharedKotlinx_coroutines_coreLockFreeLinkedListNode *)node __attribute__((swift_name("addOneIfEmpty(node:)")));
- (SharedKotlinx_coroutines_coreLockFreeLinkedListNodeAddLastDesc<SharedKotlinx_coroutines_coreLockFreeLinkedListNode *> *)describeAddLastNode:(SharedKotlinx_coroutines_coreLockFreeLinkedListNode *)node __attribute__((swift_name("describeAddLast(node:)")));
- (SharedKotlinx_coroutines_coreLockFreeLinkedListNodeRemoveFirstDesc<SharedKotlinx_coroutines_coreLockFreeLinkedListNode *> *)describeRemoveFirst __attribute__((swift_name("describeRemoveFirst()")));
- (void)helpRemove __attribute__((swift_name("helpRemove()")));
- (SharedKotlinx_coroutines_coreLockFreeLinkedListNode * _Nullable)nextIfRemoved __attribute__((swift_name("nextIfRemoved()")));
- (BOOL)remove __attribute__((swift_name("remove()")));
- (id _Nullable)removeFirstIfIsInstanceOfOrPeekIfPredicate:(SharedBoolean *(^)(id _Nullable))predicate __attribute__((swift_name("removeFirstIfIsInstanceOfOrPeekIf(predicate:)")));
- (SharedKotlinx_coroutines_coreLockFreeLinkedListNode * _Nullable)removeFirstOrNull __attribute__((swift_name("removeFirstOrNull()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) BOOL isRemoved __attribute__((swift_name("isRemoved")));
@property (readonly, getter=next_) id _Nullable next __attribute__((swift_name("next")));
@property (readonly) SharedKotlinx_coroutines_coreLockFreeLinkedListNode *nextNode __attribute__((swift_name("nextNode")));
@property (readonly) SharedKotlinx_coroutines_coreLockFreeLinkedListNode *prevNode __attribute__((swift_name("prevNode")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreLockFreeLinkedListNode.AbstractAtomicDesc")))
@interface SharedKotlinx_coroutines_coreLockFreeLinkedListNodeAbstractAtomicDesc : SharedKotlinx_coroutines_coreAtomicDesc
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (void)completeOp:(SharedKotlinx_coroutines_coreAtomicOp<id> *)op failure:(id _Nullable)failure __attribute__((swift_name("complete(op:failure:)")));
- (id _Nullable)failureAffected:(SharedKotlinx_coroutines_coreLockFreeLinkedListNode * _Nullable)affected __attribute__((swift_name("failure(affected:)")));
- (void)finishOnSuccessAffected:(SharedKotlinx_coroutines_coreLockFreeLinkedListNode *)affected next:(SharedKotlinx_coroutines_coreLockFreeLinkedListNode *)next __attribute__((swift_name("finishOnSuccess(affected:next:)")));
- (void)finishPreparePrepareOp:(SharedKotlinx_coroutines_coreLockFreeLinkedListNodePrepareOp *)prepareOp __attribute__((swift_name("finishPrepare(prepareOp:)")));
- (id _Nullable)onPreparePrepareOp:(SharedKotlinx_coroutines_coreLockFreeLinkedListNodePrepareOp *)prepareOp __attribute__((swift_name("onPrepare(prepareOp:)")));
- (void)onRemovedAffected:(SharedKotlinx_coroutines_coreLockFreeLinkedListNode *)affected __attribute__((swift_name("onRemoved(affected:)")));
- (id _Nullable)prepareOp:(SharedKotlinx_coroutines_coreAtomicOp<id> *)op __attribute__((swift_name("prepare(op:)")));
- (BOOL)retryAffected:(SharedKotlinx_coroutines_coreLockFreeLinkedListNode *)affected next:(id)next __attribute__((swift_name("retry(affected:next:)")));
- (SharedKotlinx_coroutines_coreLockFreeLinkedListNode * _Nullable)takeAffectedNodeOp:(SharedKotlinx_coroutines_coreOpDescriptor *)op __attribute__((swift_name("takeAffectedNode(op:)")));
- (id)updatedNextAffected:(SharedKotlinx_coroutines_coreLockFreeLinkedListNode *)affected next:(SharedKotlinx_coroutines_coreLockFreeLinkedListNode *)next __attribute__((swift_name("updatedNext(affected:next:)")));
@property (readonly) SharedKotlinx_coroutines_coreLockFreeLinkedListNode * _Nullable affectedNode __attribute__((swift_name("affectedNode")));
@property (readonly) SharedKotlinx_coroutines_coreLockFreeLinkedListNode * _Nullable originalNext __attribute__((swift_name("originalNext")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreLockFreeLinkedListNodeAddLastDesc")))
@interface SharedKotlinx_coroutines_coreLockFreeLinkedListNodeAddLastDesc<T> : SharedKotlinx_coroutines_coreLockFreeLinkedListNodeAbstractAtomicDesc
- (instancetype)initWithQueue:(SharedKotlinx_coroutines_coreLockFreeLinkedListNode *)queue node:(T)node __attribute__((swift_name("init(queue:node:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (void)finishOnSuccessAffected:(SharedKotlinx_coroutines_coreLockFreeLinkedListNode *)affected next:(SharedKotlinx_coroutines_coreLockFreeLinkedListNode *)next __attribute__((swift_name("finishOnSuccess(affected:next:)")));
- (void)finishPreparePrepareOp:(SharedKotlinx_coroutines_coreLockFreeLinkedListNodePrepareOp *)prepareOp __attribute__((swift_name("finishPrepare(prepareOp:)")));
- (BOOL)retryAffected:(SharedKotlinx_coroutines_coreLockFreeLinkedListNode *)affected next:(id)next __attribute__((swift_name("retry(affected:next:)")));
- (SharedKotlinx_coroutines_coreLockFreeLinkedListNode * _Nullable)takeAffectedNodeOp:(SharedKotlinx_coroutines_coreOpDescriptor *)op __attribute__((swift_name("takeAffectedNode(op:)")));
- (id)updatedNextAffected:(SharedKotlinx_coroutines_coreLockFreeLinkedListNode *)affected next:(SharedKotlinx_coroutines_coreLockFreeLinkedListNode *)next __attribute__((swift_name("updatedNext(affected:next:)")));
@property (readonly) SharedKotlinx_coroutines_coreLockFreeLinkedListNode * _Nullable affectedNode __attribute__((swift_name("affectedNode")));
@property (readonly) T node __attribute__((swift_name("node")));
@property (readonly) SharedKotlinx_coroutines_coreLockFreeLinkedListNode *originalNext __attribute__((swift_name("originalNext")));
@property (readonly) SharedKotlinx_coroutines_coreLockFreeLinkedListNode *queue __attribute__((swift_name("queue")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreLockFreeLinkedListNodeRemoveFirstDesc")))
@interface SharedKotlinx_coroutines_coreLockFreeLinkedListNodeRemoveFirstDesc<T> : SharedKotlinx_coroutines_coreLockFreeLinkedListNodeAbstractAtomicDesc
- (instancetype)initWithQueue:(SharedKotlinx_coroutines_coreLockFreeLinkedListNode *)queue __attribute__((swift_name("init(queue:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (id _Nullable)failureAffected:(SharedKotlinx_coroutines_coreLockFreeLinkedListNode * _Nullable)affected __attribute__((swift_name("failure(affected:)")));
- (void)finishOnSuccessAffected:(SharedKotlinx_coroutines_coreLockFreeLinkedListNode *)affected next:(SharedKotlinx_coroutines_coreLockFreeLinkedListNode *)next __attribute__((swift_name("finishOnSuccess(affected:next:)")));
- (void)finishPreparePrepareOp:(SharedKotlinx_coroutines_coreLockFreeLinkedListNodePrepareOp *)prepareOp __attribute__((swift_name("finishPrepare(prepareOp:)")));
- (BOOL)retryAffected:(SharedKotlinx_coroutines_coreLockFreeLinkedListNode *)affected next:(id)next __attribute__((swift_name("retry(affected:next:)")));
- (SharedKotlinx_coroutines_coreLockFreeLinkedListNode * _Nullable)takeAffectedNodeOp:(SharedKotlinx_coroutines_coreOpDescriptor *)op __attribute__((swift_name("takeAffectedNode(op:)")));
- (id)updatedNextAffected:(SharedKotlinx_coroutines_coreLockFreeLinkedListNode *)affected next:(SharedKotlinx_coroutines_coreLockFreeLinkedListNode *)next __attribute__((swift_name("updatedNext(affected:next:)")));
@property (readonly) SharedKotlinx_coroutines_coreLockFreeLinkedListNode * _Nullable affectedNode __attribute__((swift_name("affectedNode")));
@property (readonly) SharedKotlinx_coroutines_coreLockFreeLinkedListNode * _Nullable originalNext __attribute__((swift_name("originalNext")));
@property (readonly) SharedKotlinx_coroutines_coreLockFreeLinkedListNode *queue __attribute__((swift_name("queue")));
@property (readonly) T _Nullable result __attribute__((swift_name("result")));
@end;

#pragma pop_macro("_Nullable_result")
#pragma clang diagnostic pop
NS_ASSUME_NONNULL_END
