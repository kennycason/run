package com.kennycason.call.commands.internal

/**
 * Created by kenny on 5/18/16.
 */
interface InternalCommand : Command {
    override fun run(command : List<String>)
}