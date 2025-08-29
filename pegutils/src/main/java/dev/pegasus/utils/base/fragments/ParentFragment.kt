package dev.pegasus.utils.base.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding

abstract class ParentFragment<T : ViewBinding>(val bindingFactory: (LayoutInflater) -> T) : PermissionFragment() {

    /**
     * These properties are only valid between onCreateView and onDestroyView
     * @property binding
     *          -> after onCreateView
     *          -> before onDestroyView
     */
    private var _binding: T? = null
    protected val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = bindingFactory(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onViewCreated()
        initObservers()
    }

    /**
     *  @since : Start code...
     */
    abstract fun onViewCreated()

    open fun initObservers() {}

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}