# Descriptive lifecycle of dynamic fragments.

Callback Sequence:

D/myLogs: MainActivity onCreate

D/myLogs: MainActivity onStart

D/myLogs: MainActivity onResume

D/myLogs: Fragment1 onCreate

D/myLogs: Fragment1 onActivityCreated

D/myLogs: Fragment1 onStart

D/myLogs: Fragment1 onResume

D/myLogs: Fragment2 onCreate

D/myLogs: Fragment2 onActivityCreated

D/myLogs: Fragment2 onStart

D/myLogs: Fragment2 onResume

D/myLogs: Fragment1 onPause

D/myLogs: Fragment1 onStop

D/myLogs: Fragment1 onDestroyView

D/myLogs: Fragment1 onDestroy

D/myLogs: Fragment1 onDetach

D/myLogs: Fragment2 onPause

D/myLogs: Fragment2 onStop

D/myLogs: Fragment2 onDestroyView

D/myLogs: Fragment2 onDestroy

D/myLogs: Fragment2 onDetach
